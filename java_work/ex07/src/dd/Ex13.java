package dd;

public class Ex13 {
    public static void main(String[] args) {
//      int < long < double
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20l; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
        //작은 형을 큰 형에 넣는건 아무문제가 없다
        //자동으로 바꿔줌 그래서 자동형변환
    }
}
