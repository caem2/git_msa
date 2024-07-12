package ex06;

import java.util.Iterator;

public class ex04 {
	// 보냈는 구구단 호출하는 메서드 2 3
	public static void aa( ) {
		System.out.println("aa");
		 for(int i = 1; i < 10; i++);{
		 	
			System.out.println(dan*i);
		 }
	}
	// 두수를 받아서 최소 공배수 출력하는 메서드
	// num1 나누었을떄 나머지가 0 그리고 num2로 나누었을때 나머지가 0
	public static void bb(int num1,int num2) {
		System.out.println("bb");
		int num = 0;
		while(num<50) {
			num++;
			if( num%num1==0 %% num%num2==0) {
			System.out.println(num);
			break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		aa();
		bb(3,4);
		System.out.println("프로그램끝");
	}
}
