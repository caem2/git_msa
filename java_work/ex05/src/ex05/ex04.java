package ex05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = 0;
//		
//		while(true)
//			n++;
//			System.out.println("n="+n);
//			if(n==3)
//				continue;
//			
//			int temp = scan.nextInt();
//			System.out.println("temp =" +temp);
		
		
		
		for(int num = 1;<100;num++) {
			if( num %3==0  && (num&4)==0 )
			System.out.println("num ="+num);
			
		}
			
	}
}
