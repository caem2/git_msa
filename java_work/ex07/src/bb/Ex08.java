package bb;

public class Ex08 {
    public static void main(String[] args) {
        //switch문은 if문 보다 조금더 편리하게 사용가능
        //if문은 비교연산자를 사용할수있지만 switch문은 단순한값이 같은지만 알수있음


        //switch문으로 바꿔보쟙

        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
