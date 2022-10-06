package com.example.mvctest.Service;

import com.example.mvctest.Dto.MemberInfoResponseDto;
import com.example.mvctest.Dto.MemberRequestDto;
import com.example.mvctest.Entity.Member;
import com.example.mvctest.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberInfoResponseDto findMember(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow();
        return new MemberInfoResponseDto(member);
    }

    @Transactional
    public List<MemberInfoResponseDto> findAllMember() {
        List<Member> memberlist = memberRepository.findAll();
        return memberlist.stream().map(MemberInfoResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public Long registertest(MemberRequestDto memberRequestDto){
        Member member = new Member(memberRequestDto);
        memberRepository.save(member);

        return member.getId();
    }
}