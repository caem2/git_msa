package aa;

public class temp1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;
    /*
        a = b 라고하면 a값이(10) 없어진다
        그래서 temp에 보관함
     */

        temp = a;//10
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
