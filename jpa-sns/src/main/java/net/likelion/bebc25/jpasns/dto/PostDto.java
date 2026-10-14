package net.likelion.bebc25.jpasns.dto;

import net.likelion.bebc25.jpasns.domain.Comment;
import net.likelion.bebc25.jpasns.domain.Post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// 게시글 정보를 담는 DTO 모음
public class PostDto {

    // 게시글 등록 요청시 전달되는 DTO
    public record CreateRequest(
            String content
    ){}

    // 게시글 응답용 DTO (댓글 미포함)
    public record Response(
            Long id,
            String content,
            String authorNickname,
            LocalDateTime createdAt
    ){
        // Post 엔티티를 Response DTO로 변환
        public static Response from(Post post){
            return new Response(
                    post.getId(),
                    post.getContent(),
                    post.getMember().getNickname(),
                    post.getCreatedAt()
            );
        }
    }

    // 게시글 응답용 DTO (댓글 포함)
    public record DetailResponse(
            Long id,
            String content,
            String authorNickname,
            LocalDateTime createdAt,
            List<CommentDto.Response> comments
    ){
        // Post 엔티티를 Response DTO로 변환
        public static DetailResponse from(Post post){
            // stream api를 사용하지 않을 경우
            /*
            List<CommentDto.Response> comments = new ArrayList<>();
            for(Comment comment : post.getComments()){
                CommentDto.Response commentResponse = CommentDto.Response.from(comment);
                comments.add(commentResponse);
            }
            */

            List<CommentDto.Response> comments = post.getComments().stream()
                    .map(CommentDto.Response::from)
                    .toList();

            return new DetailResponse(
                    post.getId(),
                    post.getContent(),
                    post.getMember().getNickname(),
                    post.getCreatedAt(),
                    comments
            );
        }
    }
}
