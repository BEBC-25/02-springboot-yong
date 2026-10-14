package net.likelion.bebc25.jpasns.service;

import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.dto.CommentDto;
import net.likelion.bebc25.jpasns.dto.PostDto;
import net.likelion.bebc25.jpasns.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class PostServiceTest {

    @Autowired
    private PostService postService;

    @Autowired
    private MemberRepository memberRepository;

    private Long memberId;

    @BeforeEach
    void setUp(){
        Member member = new Member("haru@lion.com", "1234", "하루");
        memberRepository.save(member);
        memberId = member.getId();
    }

    @Test
    @DisplayName("게시글 작성 및 댓글 등록")
    void createPostAndComments(){
        PostDto.CreateRequest postRequest = new PostDto.CreateRequest("멍멍");
        PostDto.Response postResponse = postService.createPost(memberId, postRequest);

        postService.createComment(postResponse.id(), memberId, new CommentDto.CreateRequest("왈왈"));

    }

}













