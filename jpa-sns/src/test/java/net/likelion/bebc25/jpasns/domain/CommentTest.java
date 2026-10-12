package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class CommentTest {

    @Autowired
    private EntityManager em;

    private Long newMemberId;
    private Long newPostId;
    private Long newCommentId;

    @BeforeEach // 각 테스트 케이스 실행 전에 실행 코드
    void setUp(){
        // 1. 회원 등록
        Member member = new Member("haru@test.com", "1234", "하루");
        em.persist(member); // insert 쿼리문이 실행되어 회원이 등록됨
        this.newMemberId = member.getId(); // 새로 등록된 회원 id

        // 2. 게시글 등록
        Post post = new Post(member, "멍멍");
        em.persist(post); // insert 쿼리문이 실행되어 게시글이 등록됨
        this.newPostId = post.getId(); // 새로 등록된 게시글 id

        // 3. 댓글 등록
        Comment comment = new Comment("댓글1", member);
        comment.assignPost(post);
        em.persist(comment); // insert 쿼리문이 실행되어 댓글이 등록됨
        this.newCommentId = comment.getId(); // 새로 등록된 댓글 id

        em.clear(); // 캐시 삭제
    }

    @Test
    @DisplayName("댓글 등록")
//    @Commit // 테스트 종료 후 롤백 시키지 않고 커밋함
    void create(){
        Post findPost = em.find(Post.class, newPostId);
        Member fineMember = em.find(Member.class, newMemberId);

        Comment comment = new Comment("댓글2", fineMember);
        comment.assignPost(findPost);
        em.persist(comment); // insert 쿼리문이 실행되어 댓글이 등록됨

        em.clear(); // 캐시를 비우기

        // 등록한 댓글을 조회
        Comment findComment = em.find(Comment.class, comment.getId()); // select 쿼리문이 실행되어 댓글이 조회됨

        // 조회한 댓글 정보를 이용해서 댓글 등록 검증
        assertThat(findComment).isNotNull();
        assertThat(findComment.getId()).isEqualTo(comment.getId());
        assertThat(findComment.getPost().getId()).isEqualTo(newPostId);
        assertThat(findComment.getMember().getNickname()).isEqualTo("하루"); // 댓글의 작성자가 "하루" 가 맞나?
        assertThat(findComment.getCreatedAt()).isNotNull();
    }

    @Test
    @DisplayName("댓글 조회")
    void read(){
        Comment findComment = em.find(Comment.class, newCommentId);

        // 영속성 컨텍스트의 1차 캐시값에서 즉시 반환되며 select 쿼리를 실행하지 않음
        Comment findComment2 = em.find(Comment.class, newCommentId);

        assertThat(findComment).isSameAs(findComment2); // 동일한 주소를 가지고 있는 객체인지 여부(==)

        assertThat(findComment).isNotNull();
        assertThat(findComment.getContent()).isEqualTo("댓글1");
        assertThat(findComment.getMember().getId()).isEqualTo(newMemberId);
        assertThat(findComment.getPost().getId()).isEqualTo(newPostId);
    }

    @Test
    @DisplayName("댓글 수정")
    void update(){
        Comment targetComment = em.find(Comment.class, newCommentId);

        // 준영속 상태로 엔티티 변환
//        em.detach(targetComment);

        // 엔티티의 속성이 수정되면 update 쿼리가 생성
        // 실행은 바로 되지 않고 버퍼에 저장되고 커밋 직전에 실행됨(쓰기 지연)
        targetComment.changeContent("수정된 댓글");

        em.flush(); // 버퍼의 데이터를 DB에 전송(실제 update 실행)
        em.clear();

        Comment updatedComment = em.find(Comment.class, newCommentId);
        assertThat(updatedComment.getContent()).isEqualTo("수정된 댓글");
    }

    @Test
    @DisplayName("댓글 삭제")
    void delete(){
        Comment targetComment = em.find(Comment.class, newCommentId);
        em.remove(targetComment); // delete 쿼리문 생성해서 쓰기 지연 SQL 버퍼에 저장

        em.flush();
        em.clear();

        Comment findComment = em.find(Comment.class, newCommentId);
        assertThat(findComment).isNull();
    }

    @Test
    @DisplayName("게시글-댓글 양방향 연관관계 매핑")
    void postCommentBiDirectionalMapping(){
        // 사용자, 게시글 조회
        Member member = em.find(Member.class, newMemberId);
        Post post = em.find(Post.class, newPostId);

        Comment comment2 = new Comment("댓글2", member);
        Comment comment3 = new Comment("댓글3", member);

        post.addComment(comment2);
        post.addComment(comment3);

        em.flush();
        em.clear();

        // 게시글 조회시 댓글 목록 확인(역방향 1 -> N)
        Post findPost = em.find(Post.class, newPostId);
        assertThat(findPost).isNotNull();
        assertThat(findPost.getComments()).hasSize(3);
        assertThat(findPost.getComments())
                .extracting(Comment::getContent) // 컬랙션 내 엔티티들의 특정 필드를 추출
                .containsExactly("댓글1", "댓글2", "댓글3"); // 추출된 값들이 내용과 순서가 일치하는지 확인
        em.clear();

        // 댓글 조회시 게시글 확인(정방향 N -> 1)
        Comment findComment = em.find(Comment.class, comment2.getId());
        assertThat(findComment).isNotNull();
        assertThat(findComment.getPost().getId()).isEqualTo(post.getId());
        assertThat(findComment.getPost().getMember().getNickname()).isEqualTo("하루");
        assertThat(findComment.getPost().getContent()).isEqualTo("멍멍");
        assertThat(findComment.getMember().getEmail()).isEqualTo("haru@test.com");
    }
}










