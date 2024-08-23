package org.example;

public class Main {
    public static void main(String[] args) {

        MemberDto.MenberReqDto menberReqDto
                = new MemberDto.MenberReqDto("홍길동",20);

        System.out.println(menberReqDto);

        MemberDto.MemberResDto memberResDto
                = new MemberDto.MemberResDto("홍길동",20);

        System.out.println(memberResDto);
    }
}


