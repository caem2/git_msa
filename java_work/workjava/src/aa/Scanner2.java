package aa;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하나의 정수를 입력");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("입력한 숫자" + num + "는 짝수");
        }else {
            System.out.println("입력한 숫자" + num + "는 홀수");
        }
    }
}
