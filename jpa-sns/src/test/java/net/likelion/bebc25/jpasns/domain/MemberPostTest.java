package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
        Member member = em.find(Member.class, newMemberId);
        Post post = new Post(member, "첫번째 게시글");
        em.persist(post);

        em.flush();
        em.clear();

        // 2. 등록한 게시글 조회
        Post findPost = em.find(Post.class, post.getId());
        assertThat(findPost).isNotNull();
        assertThat(findPost.getContent()).isEqualTo("첫번째 게시글");
        assertThat(findPost.getMember().getId()).isEqualTo(newMemberId);
        assertThat(findPost.getMember().getNickname()).isEqualTo("테스터1");
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
    @Commit
    void baseTimeAuditing(){
        Member findMember = em.find(Member.class, newMemberId);

        LocalDateTime createdAt = findMember.getCreatedAt(); // 등록일
        LocalDateTime updatedAt = findMember.getCreatedAt(); // 수정일

        assertThat(createdAt).isNotNull(); // 등록일 주입 여부
        assertThat(updatedAt).isNotNull(); // 수정일 주입 여부
        assertThat(createdAt).isEqualTo(updatedAt); // 등록일과 수정일이 같은지 여부

        findMember.changeNickname("테스터2"); // update 쿼리 생성(버퍼)

        em.flush(); // update 실행
        em.clear();

        Member updatedMember = em.find(Member.class, newMemberId);

        assertThat(updatedMember).isNotNull();
        assertThat(updatedMember.getNickname()).isEqualTo("테스터2"); // 수정된 닉네임 확인
        assertThat(updatedMember.getCreatedAt()).isEqualTo(createdAt); // 등록일은 수정되지 않음
        assertThat(updatedMember.getUpdatedAt()).isNotEqualTo(updatedAt); // 수정일은 수정됨
    }
}
