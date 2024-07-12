
public class Ex07 {
    /*
    1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
 이 두 함수를 호출하는 방식으로 프로그램을 완성하자.
     */
    public static void main(String[] args) {

        int a[] = new int[10];

        int b[] = {1,3,5,7,9};

        int c[] = {2,4,6,8,10};

        System.out.println("a.length ="+a.length);



        for (int i = 0; i <5 ; i++) {
            System.out.println("홀수는? ="+int b);
        }

        System.out.println("짝수는?");

        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println(c[4]);

    }
}
