package ex04;

public class ex03 {

	public static void main(String[] args) {
		int num1 = 10;
		/*
		 *  브레이크포인트...더블클릭
		 *  벌레모양으로 실행
		 *  f6 한줄씩 진행
		 *  f8 종료
		 */
		// num++
		// num = num+1
		// num += 1
		//똑같은 표현방식
		
		//home 그 줄에서 제일앞으로
		// end 그 줄에서 제일 뒤로
		// shift 블럭지정
		// 블럭지정해놓고 ctrl + d 여러줄삭제
		System.out.println(num1++);
		System.out.println(++num1);
		
		System.out.println(num1);
		
		System.out.println(num1--);
		System.out.println(--num1);
		
		System.out.println(num1);
		
	}
}
