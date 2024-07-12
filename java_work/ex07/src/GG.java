/*
    1.두개의 주사위 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
 */


public class GG {

    public static void main(String[] args) {
        /*
        1/5 2/4 3/3 4/2 5/1
         */
        for (int i =1;  i <5; i++){
            for (int j =1; j < 5; j++) {


//                System.out.println("i+j =" + (j+i));

                if ((i+j)==6){
                    System.out.println("j="+i+" ");
                    System.out.println("i="+i);
                }


            }
        }

    }
}
