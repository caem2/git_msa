package ex06;

public class ex03 {
	private static void hieverone(int i) {
		System.out.println("여기온다");
		
		if(i==12) {
			System.out.println("i는 = 12입니다");
		}
		for(int k = 0; k<3;k++) {
			System.out.println("k ="+k);
		}
	}
	public static void main(String[] args) {
		int k =20;
		System.out.println("===프로그램 시작===");
		hieverone(12);
		hieverone(13);
		System.out.println("===프로그램 끝===");
	}

	
	
}
