package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    /*
    interface

    변수..public static final 안적어두댐
    int A
    몸체가 없는 메서드..public 안적어두댐
    void doA();

    class 만들어서 interface 상속 받아야댐
    doA() 메서드 재정의..

    default() -> new .. 사용해는 되는것
    static() -> Printable.doA();

    람다 규칙은
    interface 하나의 추상메서드가 존재 해야한다
    ()->{}

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("a : ");
            int a = scanner.nextInt();
            System.out.println("b : ");
            int b = scanner.nextInt();

            System.out.println("나누기 시작");
            System.out.println(a / b);
            System.out.println("나누기 끝");

        } catch (InputMismatchException ie){
            System.out.println();
        } catch (Exception e) {
            System.out.println("0으로 나눌수없셈");
        }
        }
    }

