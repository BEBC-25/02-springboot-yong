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
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String introduction;

    @Embedded
    private Address address;

    @Column(length = 1, nullable = false)
    private String marketingAgreed;

    public MemberDetail(Long id, String introduction, Address address, String marketingAgreed) {
        this.id = id;
        this.introduction = introduction;
        this.address = address;
        this.marketingAgreed = marketingAgreed;
    }

    public MemberDetail(Long id, String introduction, Address address) {
        this(id, introduction, address, "N");
    }
}
