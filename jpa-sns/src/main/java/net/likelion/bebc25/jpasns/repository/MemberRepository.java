package net.likelion.bebc25.jpasns.repository;

import net.likelion.bebc25.jpasns.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 이메일 중복 체크용
    boolean existsByEmail(String email);

    // 닉네임 중복 체크용
    boolean existsByNickname(String nickname);

    // 이메일 단건 조회(로그인용)
    Optional<Member> findByEmail(String email);

}
