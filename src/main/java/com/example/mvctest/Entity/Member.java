package com.example.mvctest.Entity;

import com.example.mvctest.Dto.MemberRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    public Member(MemberRequestDto memberRequestDto){
        this.name = memberRequestDto.getName();
        this.email = memberRequestDto.getEmail();
        this.pw = memberRequestDto.getPw();
    }

}
