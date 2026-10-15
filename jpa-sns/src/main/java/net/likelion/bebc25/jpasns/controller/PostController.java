package net.likelion.bebc25.jpasns.controller;

import lombok.RequiredArgsConstructor;
import net.likelion.bebc25.jpasns.dto.CommentDto;
import net.likelion.bebc25.jpasns.dto.PostDto;
import net.likelion.bebc25.jpasns.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    // 게시글 작성
    @PostMapping
    public ResponseEntity<PostDto.Response> createPost(
            @RequestHeader("X-Member-Id") Long memberId,
            @RequestBody PostDto.CreateRequest request
    ){
        PostDto.Response response = postService.createPost(memberId, request);
        return ResponseEntity.created(URI.create("/api/v1/posts/" + response.id())).body(response);
    }

    // 게시글 목록 조회
    @GetMapping
    public ResponseEntity<List<PostDto.Response>> getPosts(
            @RequestParam(required = false) Long memberId,
            @RequestParam(required = false) String keyword
    ){
        // memberId 존재 여부에 따라서 전체 게시글 목록을 조회하거나 지정한 회원의 게시글만 조회하거나 분기 처리
        List<PostDto.Response> response = postService.getPosts(memberId, keyword);
        return ResponseEntity.ok(response);
    }

    // 게시글 상세 조회
    @GetMapping("/{id}")
    public ResponseEntity<PostDto.DetailResponse> getPost(@PathVariable Long id){
        PostDto.DetailResponse response = postService.getPost(id);
        return ResponseEntity.ok(response);
    }

    // 댓글 작성
    @PostMapping("/{id}/comments")
    public ResponseEntity<CommentDto.Response> addComment(
            @PathVariable Long id,
            @RequestHeader("X-Member-Id") Long memberId,
            @RequestBody CommentDto.CreateRequest request
    ){
        CommentDto.Response response = postService.addComment(id, memberId, request);
        return ResponseEntity.created(URI.create("/api/v1/posts/" + id + "/comments/" + response.id())).body(response);
    }

}
