package org.example;

public class Ex01 {

    public static void main(String[] args) {
        //primitive 함수없움
        int a = 10;
        //wrapper 클래스 이기때문에
        Integer b = Integer.valueOf(20);

        System.out.println(a);
        System.out.println(b);

        // unboxing 래퍼클래스가 기본자료형 타입으로 자동 변환
        a = b;
    }
}
