package ex04;

public class ex08 {
	/*
	 * 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일사과의 수가 123개이고
	 * 하나의 바구니에는 10개릐 사과를 담을수 있다면 13개의 바구니가 필요할 것이다. (1)에 알맞는 코드를 넣으시오
	 */
	
	public static void main(String[] args) {
		int numOfApples = 123;
		int aizeOfBucket = 10;
		int sizeOfBucket = 0;
		int numOfApple = 0;
		int numOfBucket =numOfApples /sizeOfBucket +(numOfApple % sizeOfBucket > 0 ? 1 : 0);
		System.out.println("필요한 바구니의 수" + numOfBucket);	
	}
}

