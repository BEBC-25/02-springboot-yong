package net.likelion.bebc25.jpasns.dto;

import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.domain.Role;

public class MemberDto {
    // 회원 정보를 담는 요청 DTO
    public record CreateRequest(
            String email,
            String password,
            String nickname
    ){
        // DB 저장을 위한 Member 엔티티로 변환
        public Member toEntity(){
            return new Member(email, password, nickname, Role.USER);
        }
    }

    // 회원 정보를 담는 응답 DTO
    public record Response(
            Long id,
            String email,
            String nickname,
            String role
    ){
        // Member 엔티티를 Response 응답 DTO로 변환
        public static Response from(Member member){
            return new Response(
                    member.getId(),
                    member.getEmail(),
                    member.getNickname(),
                    member.getRole().name()
            );
        }
    }
}

