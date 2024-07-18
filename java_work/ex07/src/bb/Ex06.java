package bb;

public class Ex06{
    public static void main(String[] args) {

        //실행할 명령이 하나만 있을경우에는 {} 생략가능하다
        if (true)
            System.out.println("if문에서 실행됨");

        //두번째 명령은 if문과 별개임 if문에 포함 할려면 {}쓰면됨
        if (true)
            System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행 안됨");

        //이로케~~~ //명령어가 한개만 있어도 {} 쓰는게 조타~
        if (true) {
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행 안됨");
        }



    }
}
