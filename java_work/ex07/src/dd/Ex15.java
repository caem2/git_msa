package dd;

public class Ex15 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;//int 최고값
        long maxIntOver = 2147483648L;//int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int)maxIntValue;//형변환
        System.out.println("maxIntOver casting= " + intValue);

        maxIntValue = (int) 2147483640L;//형변환
        System.out.println("maxIntOver casting= " + intValue);
    }
}
//오버플로우가 발생하는것이 문제임 오버플로우가 발생하기전에 막으셈