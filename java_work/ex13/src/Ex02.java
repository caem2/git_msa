import java.util.Arrays;

public class Ex02 {
    /*
    1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    제한사항 1<= str의 길이 <=10
    입력 #1
    abcde
    출력
    a
    b
    c
    d
    e
     */
    public static void main(String[] args) {

        int[][]str = new int[1][5];

        System.out.println();
        int temp[] = str[5];
        str[2] = str[0];
        str[0] =temp;

        System.out.println(Arrays.toString(str[0]));
        System.out.println(Arrays.toString(str[1]));
        System.out.println(Arrays.toString(str[2]));



    }
}
