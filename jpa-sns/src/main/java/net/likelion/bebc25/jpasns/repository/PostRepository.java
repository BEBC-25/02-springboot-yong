package net.likelion.bebc25.jpasns.repository;

import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 특정 회원 작성한 게시글 목록을 조회(최신 등록 순으로)
    List<Post> findByMemberOrderByCreatedAtDesc(Member member);
}
