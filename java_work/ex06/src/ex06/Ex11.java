package ex06;

public class Ex11 {

	public static void main(String[] args) {

		int sum = 0;
		int n = 0;
		while (n < 20) {
			// 2로 나누었을때 0이 아니고 3으로 나누었을때 0이 아닌수
			// 1,5,7,11,17
			
			// sum 에다가 n의 값을 더해서 sum 에다가 넣을꺼다...
			n++;
			if (n % 2 != 0 && n % 3 != 0) {
				System.out.println(n);
				sum = sum + n;
			}
		}
		System.out.println(sum);

	}
}
