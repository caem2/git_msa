package ex04;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
// 아래는 변수의 num의 값에 따라 '양수','음수','0'을 출력하는 코드이다 . 삼항 연산자를 이용해서 (1)에 알맞은 코드를 구하시오
		Scanner scan = new Scanner(System.in);
		
		int num =scan.nextInt();
		System.out.println(num > 0 ? "양수":"음수");
		
		
	}
	
}
