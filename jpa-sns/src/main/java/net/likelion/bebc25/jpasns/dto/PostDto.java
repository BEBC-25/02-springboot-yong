package net.likelion.bebc25.jpasns.dto;

import net.likelion.bebc25.jpasns.domain.Post;

import java.time.LocalDateTime;

public class PostDto {
    public record CreateRequest(
            String content
    ){}

    public record Response(
            Long id,
            String content,
            String authorNickname,
            LocalDateTime createdAt
    ){
        public static Response from(Post post){
            return new Response(
                    post.getId(),
                    post.getContent(),
                    post.getMember().getNickname(),
                    post.getCreatedAt()
            );
        }
    }
}
