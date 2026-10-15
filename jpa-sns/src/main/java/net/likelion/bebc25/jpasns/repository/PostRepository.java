package net.likelion.bebc25.jpasns.repository;

import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 특정 회원 작성한 게시글 목록을 조회(최신 등록 순으로)
    List<Post> findByMemberOrderByCreatedAtDesc(Member member);

    // 전체 게시글 목록을 최신 등록순으로 정렬 조회
    List<Post> findByOrderByCreatedAtDesc();

    // 회원 식별자(PK)를 조건으로 게시글 목록 최신순 조회
    List<Post> findByMember_IdOrderByCreatedAtDesc(Long memberId);

    // 전체 게시글 목록을 키워드 포함 최신 등록순으로 정렬 조회
    List<Post> findByContentContainingOrderByCreatedAtDesc(String keyword);

    // 회원 식별자(PK)를 조건으로 본문에 키워드 포함 검색 최신 등록순으로 정렬 조회
    List<Post> findByMember_IdAndContentContainingOrderByCreatedAtDesc(Long memberId, String keyword);
}
