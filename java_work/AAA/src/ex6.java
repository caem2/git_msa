import java.util.Scanner;
import aa.bb.cc;

public class ex6 {
    /*1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
그리고 그에 따른 적절한 함수를 구현해 보자.
참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는 쉬운 문제를 제시하였다
        */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력");
        int result = scanner.nextInt();


        cc cc1 = new cc();
        int retValue = cc1.aa(10);

        System.out.println("result"+result);
        System.out.println("retValue"+retValue);

    }


    }

