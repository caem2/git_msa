package aa;

import java.util.Scanner;

public class CalSecond {

    //초를 입력받는 함수
    public int inputNumber(){
        System.out.println("초입력 :");
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();
        return result;

    }
    //int 를 넘겨주면 String을 반환하는 변수

    public String calculate(int second){
        int hour = second / 3600;
        int min = (second%3600)/60;
        return hour+"시간"+min+"분"+second+"47초";

    }

    //tostring 은 생략되어진 문법이다
}
