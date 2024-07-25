package aa;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력:");
        int n = input.nextInt();

        System.out.println("단의 구구단:");
        for (int i = 1; i < 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
