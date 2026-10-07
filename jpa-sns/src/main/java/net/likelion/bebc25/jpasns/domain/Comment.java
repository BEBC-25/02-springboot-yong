package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.lang.annotation.control.CodeGenerationHint;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false)
    private Long memberId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Comment(String content, Long postId, Long memberId) {
        this.content = content;
        this.postId = postId;
        this.memberId = memberId;
        this.createdAt = LocalDateTime.now();
    }

    // 댓글 수정에 사용될 비즈니스 메서드
    public void changeContent(String content){
        this.content = content;
    }


}
