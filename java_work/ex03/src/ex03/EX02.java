package ex03;

import java.util.Scanner;

public class EX02 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		// Scanner 무엇인가를 입력받아서 사용할떄 쓰는문법
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		
		//a 변수에 숫자 입력 받아 넣는 문구
		a = scan.nextInt();
		System.out.println("a =" +a);
		
		b = scan.nextInt();
		System.out.println("b =" + b);
		
	}

}
