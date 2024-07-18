package bb;

public class Ex09 {

    //비즈니스 요구사항이 변경되었다. 2등급도 3등급과 같이 3000원 쿠폰을 준다고 해보자
     public static void main(String[] args) {

        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 = " + coupon);
    }

    /*
    grade가 2등급이면 case2 가 실행됨
    근데 case 2 에는 break가없다 그래서 바로 case 3을 실행한다
    그래서 coupon = 3000 을 실행하고 break 만나서 switch 빠져나간다
     */
}
