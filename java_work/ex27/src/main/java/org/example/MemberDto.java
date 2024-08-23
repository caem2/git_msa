package org.example;

import java.net.URL;

public class MemberDto {
    private static String URL
            ="http://kakaoLogin";

    static class MenberReqDto{
        private String name;
        private int age;

        public MenberReqDto(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "MenberReqDto{" +
                    "URL='" + URL + '\'' +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class MemberResDto{
        private String name;
        private int age;

        public MemberResDto(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "MemberResDto{" +
                    "URL='" + URL + '\'' +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
