package net.likelion.bebc25.jpasns.service;

import lombok.RequiredArgsConstructor;
import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.dto.MemberDto;
import net.likelion.bebc25.jpasns.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor // final 필드용 생성자 자동 생성
public class MemberService {
    private final MemberRepository memberRepository;

    // 회원 가입
    public MemberDto.Response signUp(MemberDto.CreateRequest request){
        if(memberRepository.existsByEmail(request.nickname())){
            throw new IllegalArgumentException("사용중인 이메일입니다. email: " + request.email());
        }
        Member member = memberRepository.save(request.toEntity());
        return MemberDto.Response.from(member);
    }

    // 회원 정보 조회
    public MemberDto.Response getMember(Long id){
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. id: " + id));
        return MemberDto.Response.from(member);
    }
}

















