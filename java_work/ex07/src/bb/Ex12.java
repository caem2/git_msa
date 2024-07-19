package bb;

public class Ex12 {
//삼항연산자
    public static void main(String[] args) {
        int age = 15;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("arg = " + age + " status =" + status);
        // <(조건) ? 참 표현식 : 거짓 표현식>
        //단순한 표현식만 넣을수 있음
    }
}
