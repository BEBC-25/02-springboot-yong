package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
//    @Column(columnDefinition = "VARCHAR(100) NOT NULL UNIQUE")
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 50)
    private String nickname;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Role role;

    private String profileImage;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Member(String email, String password, String nickname) {
        this(email, password, nickname, Role.USER);
    }

    public Member(String email, String password, String nickname, Role role) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
        this.createdAt = LocalDateTime.now();
    }

    public void changeNickname(String nickname){
        this.nickname = nickname;
    }
}
