package com.example.mvctest.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemberRequestDto {

    private String name;
    private String email;
    private String pw;
}
