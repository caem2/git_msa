package aa;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력하셈:");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격 입력하셈:");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량 입력하셈:");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice + foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨슴. 총 가격은 " + totalPrice + "원임.");


    }
}
