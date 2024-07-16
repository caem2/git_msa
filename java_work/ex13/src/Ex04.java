import java.sql.Array;
import java.util.Arrays;

public class Ex04 {
    /*
     3. 다음은 answer 배열 에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서
    그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 .
    int[] answer = { 1,4,4,3,1,4,4,2,1,3,2}
    실행결과
    1***
    2**
    3**
    4****
     */
        Ex04(){
            int[] answer = { 1,4,4,3,1,4,4,2,1,3,2};
            int[] countNumber = {1,2,3,4};
            int[] starNumber = new int[countNumber.length];
            System.out.println(Arrays.toString(answer));

            doPrint(answer);
            for (int j = 0; j <countNumber.length ; j++) {
                for (int i = 0; i < answer.length; i++) {

                    if (countNumber[j] == answer[i]) {
                        starNumber[j] = starNumber[j] + 1;
                    }

            }

            }
            System.out.println(starNumber);
            for (int i = 0; i <starNumber.length ; i++) {
                System.out.println((i+1)+" : ");
                for (int j = 0; j <starNumber[i]; j++) {
                    System.out.println("*");
                }
                System.out.println();
            }
    }

    public void doPrint(int[] temp){
        System.out.println("[");
        for (int i = 0; i < temp.length ; i++) {
            if (temp.length == (i+1)) {
                System.out.println(temp[i]);
            }
            else {
                System.out.println(temp[i]+",");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        new Ex04();


    }
}
