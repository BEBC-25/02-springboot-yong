package net.likelion.bebc25.jpasns.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String introduction;

    private String address;

    @Column(length = 1, nullable = false)
    private String marketingAgreed;

    public MemberDetail(Long id, String introduction, String address, String marketingAgreed) {
        this.id = id;
        this.introduction = introduction;
        this.address = address;
        this.marketingAgreed = marketingAgreed;
    }

    public MemberDetail(Long id, String introduction, String address) {
        this(id, introduction, address, "N");
    }
}
