package ee;

import java.util.Scanner;

public class Ex05 {
    /*
    첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
프로그램은 반복해서 실행된다.
    <내가푼거>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 숫자를 0으로 입력하면 종료");

        while (true){
            System.out.print("첫번째 숫자 입력:");
            int str = scanner.nextInt();
            System.out.print("두번째 숫자 입력:");
            int str1 = scanner.nextInt();
            System.out.println("두 수 의합 :" + (str + str1));
            if (str == 0){
            if (str1 == 0){
                System.out.println(str+str1);
                break;
            }
            }
        }System.out.println("종료");
    }
}
