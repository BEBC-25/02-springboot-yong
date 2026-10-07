package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
        em.persist(member); // insert

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
        assertThat(findMember.getRole()).isEqualTo("USER");
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
    }
}
