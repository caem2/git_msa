package bb;

public class Ex01 {
    public static void main(String[] args) {
//18살 이상이면 "성인입니다" 출력하고 18살 미만이면 "미성년자입니다"를 출력해라
        int age = 20; // 사용자 나이

        if (age >= 18){
            System.out.println("성인입니다");
        }//true
        if (age < 18){
            System.out.println("미성년자입니다");
        }//false
        //거짓이라서 출력안댐
    }
}
