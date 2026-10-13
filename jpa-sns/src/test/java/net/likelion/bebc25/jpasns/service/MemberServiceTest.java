package net.likelion.bebc25.jpasns.service;

import net.likelion.bebc25.jpasns.domain.Role;
import net.likelion.bebc25.jpasns.dto.MemberDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("회원 가입 및 회원 조회")
    @Transactional
    void signUpAndGetMember(){
        MemberDto.CreateRequest request = new MemberDto.CreateRequest(
        "haru@lion.com",
        "1234",
        "하루"
        );

        MemberDto.Response response = memberService.signUp(request);

        MemberDto.Response findMember = memberService.getMember(response.id());

        assertThat(findMember).isNotNull();
        assertThat(findMember.nickname()).isEqualTo(request.nickname());
        assertThat(findMember.role()).isEqualTo(Role.USER.name());
    }
}
