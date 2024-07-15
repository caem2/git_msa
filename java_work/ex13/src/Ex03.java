import java.util.Arrays;

public class Ex03 {
    /*
      2. int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요
     */
    public static void main(String[] args) {

        int[][]arr = new int[4][5];

        Arrays.fill(arr[0], 5);
        Arrays.fill(arr[1], 10);
        Arrays.fill(arr[2], 20);
        Arrays.fill(arr[3], 30);

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));


        }

    }
    

