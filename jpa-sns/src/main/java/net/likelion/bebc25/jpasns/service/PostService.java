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

import java.util.List;

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

    // 전체 게시글 목록 조회
    public List<PostDto.Response> getPosts(Long memberId, String keyword){
        List<Post> posts;

        if(memberId != null){ // memberId가 있을 경우
            // 회원 존재 여부를 먼저 확인한 뒤 해당 회원의 게시글 목록을 조회하여 DTO로 변환하여 반환
            if(!memberRepository.existsById(memberId)){
                throw new IllegalArgumentException("존재하지 않는 회원입니다. id=" + memberId);
            }

            if(keyword != null){
                posts = postRepository.findByMember_IdAndContentContainingOrderByCreatedAtDesc(memberId, keyword);
            }else{
                posts = postRepository.findByMember_IdOrderByCreatedAtDesc(memberId);
            }
        }else{ // memberId가 없을 경우
            if(keyword != null){
                posts = postRepository.findByContentContainingOrderByCreatedAtDesc(keyword);
            }else{
                posts = postRepository.findByOrderByCreatedAtDesc();
            }
        }

        return posts.stream()
                .map(PostDto.Response::from)
                .toList();
    }

    // 게시글 상세 조회
    public PostDto.DetailResponse getPost(Long id){
        // postRepository의 메서드 중 id로 조회하는 메서드 사용
        // 조회가 되지 않을 경우 IllegalArgumentException Throw 처리
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다. id=" + id));
        return PostDto.DetailResponse.from(post);
    }

    // 댓글 등록
    @Transactional
    public CommentDto.Response addComment(Long postId, Long memberId, CommentDto.CreateRequest request){
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시글입니다. id=" + postId));
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다. id=" + memberId));

        Comment comment = new Comment(request.content(), member);

        // 영속성 컨텍스트의 동기화와 Comment에 post 정보를 추가하기 위해 필요
        post.addComment(comment);

        Comment savedComment = commentRepository.save(comment);

        return CommentDto.Response.from(savedComment);
    }

}
