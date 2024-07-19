package bb;

import java.util.Arrays;

public class Ex11 {
//삼항연산자
    public static void main(String[] args) {
        int age = 15;
        String status;
        if (age >= 18){
            status = "성인";
        }else {
            status = "미성년자";
        }
        System.out.println("arg = " + age + " status =" + status);
    }
}
