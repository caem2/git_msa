//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        for문을 while문으로 바꾸셈
            i=0일때 j가 =0~ 0이하까지
            i=1일때 j가 =0~ 1이하까지
            i=2일때 j가 =0~ 2이하까지
            i=3일때 j가 =0~ 3이하까지

            for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
         */
        int i = 0;
        while (i < 10) {
            i++;
            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}