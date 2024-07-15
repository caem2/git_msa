package aa;

public class gg {
    public static void main(String[] args) {
        // = -> 대입할때씀
        // == -> 동등한지 확인할때 씀
        // != -> 불일치 연산자 !는 반대라는뜻

        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolesn 변수에 담음
        boolean result = a == b;
        System.out.println(result);


    }
}
