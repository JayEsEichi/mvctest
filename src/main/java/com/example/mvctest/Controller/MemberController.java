package com.example.mvctest.Controller;

import com.example.mvctest.Dto.MemberInfoResponseDto;
import com.example.mvctest.Dto.MemberRequestDto;
import com.example.mvctest.Service.MemberService;
import com.example.mvctest.Service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;
    private final ResponseService responseService;

    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     */
    @GetMapping("/member/{id}")
    public SingleResponse<MemberInfoResponseDto> getMemberInfo(@PathVariable Long id) {
        return responseService.getSingleResponse(memberService.findMember(id));
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public ListResponse<MemberInfoResponseDto> getMemberList() {
        return responseService.getListResponse(memberService.findAllMember());
    }

    // 임시 회원 삽입
    @PostMapping("/register")
    public Long registeraccount(@RequestBody MemberRequestDto memberRequestDto){
        return memberService.registertest(memberRequestDto);
    }

}