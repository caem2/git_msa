package bb;

public class Ex03 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7){ //~7 : 미취학
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {// 8~13 초딩
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {// 14~
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
