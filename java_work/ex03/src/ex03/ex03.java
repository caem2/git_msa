package ex03;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("숫자입력:");
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println(a + "*" + b + "=" +a *b);
		System.out.println(a + "/" + b + "=" +a /b);
		System.out.println(a%b);
		
	}

}
