package aa.bb;
/*
    5! = 5*4!
    4! = 4*3!
    3! = 3*2!
    ...
    재귀 함수 = 자기자신의 함수를 호출하는것
 */

public class dd {
    public static int fact(int num){
       if (num > 0){
           return num * fact(num -1);
           //5 * fact(4)
       }else {
           return 1;
       }

    }
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
      //  String[] strary = {"aa","bb","cc"};
       // System.out.println("배열선언함");
      //  main(strary);

    }
}
