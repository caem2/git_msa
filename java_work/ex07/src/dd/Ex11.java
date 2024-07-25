package dd;

public class Ex11 {
    public static void main(String[] args) {

        int m = 10;
        int temp = 0;
        if (m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
/*
main 안에 temp 변수가 입력되었는데 temp는 if문 안에서만 사용된다
그래서 main 함수에 넣지말고 if 문 안에 넣도록하자
왜냐 불필요한 메모리가 증가되고 if문이 끝나면 생각 안해도되는 temp가
main 안에 있으면 계속 생각해면서 코드를 짜야한다
 */
