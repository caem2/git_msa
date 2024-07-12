public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();


    // toString 생략가능
    // 원래는 주소값이 나오는데 toString 은 내가 다시 정의할수있

        System.out.println("a참조변수 ="+a);
        System.out.println("b참조변수 ="+b);

        a.mod();
        System.out.println();

        System.out.println("a참조변수 ="+a);
        System.out.println("b참조변수 ="+b);

    }
}
