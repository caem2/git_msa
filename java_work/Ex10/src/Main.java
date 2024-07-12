import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Fact {
    public int fact(int num) {
        System.out.println("여기오나" + num);
        if (num > 0) {
            return 2 * fact(num - 1);
        }else {
            return 1;

        }
    }
}
public class Main {

    public static void main(String[] args) {

        /*
        String -> int   Integer.parseInt
        int -> String   10+"";
        문자열 입력 scan.next.line;
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("몇승 구할래?");
        //int num = scanner.nextInt();
        String a = scanner.nextLine();
        int num = Integer.parseInt(a);

        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result="+result);
       // System.out.println(a);
       // System.out.println(num);
        //클래스의 정의화 인스턴스화


    }
}