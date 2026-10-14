package net.likelion.bebc25.jpasns.service;

import lombok.RequiredArgsConstructor;
import net.likelion.bebc25.jpasns.domain.Comment;
import net.likelion.bebc25.jpasns.domain.Member;
import net.likelion.bebc25.jpasns.domain.Post;
import net.likelion.bebc25.jpasns.dto.CommentDto;
import net.likelion.bebc25.jpasns.dto.PostDto;
import net.likelion.bebc25.jpasns.repository.CommentRepository;
import net.likelion.bebc25.jpasns.repository.MemberRepository;
import net.likelion.bebc25.jpasns.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final MemberRepository memberRepository;
    private final CommentRepository commentRepository;

    // 게시글 등록
    @Transactional
    public PostDto.Response createPost(Long memberId, PostDto.CreateRequest request){
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. id=" + memberId));
        Post post = new Post(member, request.content());
        Post savedPost = postRepository.save(post); // em.persit(); -> insert 실행
        return PostDto.Response.from(savedPost);
    }

    // 게시글 상세 조회
//    public PostDto.Response getPost(Long id){
//
//    }

    // 댓글 등록
    @Transactional
    public CommentDto.Response createComment(Long postId, Long memberId, CommentDto.CreateRequest request){
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다. id=" + postId));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. id=" + memberId));

        Comment comment = new Comment(request.content(), member);
        Comment savedComment = commentRepository.save(comment);

        // 영속성 컨텍스트의 동기화를 위해 필요
        post.addComment(savedComment);

        return CommentDto.Response.from(savedComment);
    }

}
