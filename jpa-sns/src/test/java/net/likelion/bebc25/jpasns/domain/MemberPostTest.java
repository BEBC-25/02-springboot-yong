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
public class MemberPostTest {
    @Autowired
    private EntityManager em;

    private Long newMemberId;

    @BeforeEach
    void setUp(){
        // 회원 등록
        Member member = new Member("test1@test.com", "1234", "테스터1");
        em.persist(member); // insert 구문 생성

        newMemberId = member.getId();

        em.flush(); // 쿼리 실행
        em.clear(); // 캐시 삭제
    }

    @Test
    @DisplayName("회원 조회")
    void memberFind(){
        Member findMember = em.find(Member.class, newMemberId); // select

        assertThat(findMember).isNotNull();
        assertThat(findMember.getEmail()).isEqualTo("test1@test.com");
        assertThat(findMember.getRole()).isEqualTo(Role.USER);
        assertThat(findMember.getId()).isEqualTo(newMemberId);
    }

    @Test
    @DisplayName("게시글 등록 및 조회")
    void postSaveAndFind(){
        // 1. 게시글 등록
        Post post = new Post(newMemberId, "첫번째 게시글");
        em.persist(post);

        em.flush();
        em.clear();

        // 2. 등록한 게시글 조회
        Post findPost = em.find(Post.class, post.getId());
        assertThat(findPost).isNotNull();
        assertThat(findPost.getContent()).isEqualTo("첫번째 게시글");
        assertThat(findPost.getMemberId()).isEqualTo(newMemberId);
        assertThat(findPost.getCreatedAt()).isNotNull();
    }

    @Test
    @DisplayName("임베디드 주소 값 타입 매핑 확인")
    void memberDetailAddressMapping(){
        Address address = new Address("12345", "서울시 강남구 역삼동1", "101-202");
        MemberDetail memberDetail = new MemberDetail(newMemberId, "안녕하세요", address);

        em.persist(memberDetail);

        em.flush();
        em.clear();

        MemberDetail findMember = em.find(MemberDetail.class, memberDetail.getId());

        assertThat(findMember).isNotNull();
        assertThat(findMember.getAddress().getZipcode()).isEqualTo("12345");
        assertThat(findMember.getAddress().getRoadAddress()).isEqualTo("서울시 강남구 역삼동1");
        assertThat(findMember.getAddress().getDetailAddress()).isEqualTo("101-202");

    }

    @Test
    @DisplayName("BaseTimeEntity 상속 동작 확인")
    void baseTimeAuditing(){
        Member findMember = em.find(Member.class, newMemberId);

        assertThat(findMember.getCreatedAt()).isNotNull();
        assertThat(findMember.getUpdatedAt()).isNotNull();


    }
}
