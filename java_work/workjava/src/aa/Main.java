package aa;

import java.util.Scanner;
/*
문제 - 홀수 짝수
사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("하나의 정수를 입력하셈:");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("입력한 숫자는" + num1 + "는 짝수임다");
        }else {
            System.out.println("입력한 숫자는" + num1 + "는 홀수임다");
        }
    }

}