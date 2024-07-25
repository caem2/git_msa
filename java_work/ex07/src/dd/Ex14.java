package dd;

public class Ex14 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue;//컴파일 오류
        intValue = (int) doubleValue;//형변화
        System.out.println(intValue );

        int z = (int)10.5;
        System.out.println(z);
        //캐스팅 출력:10 double형에서 int 형으로 형변환 했기 때문에 소수자리를 빼고 10으로 출력된다
    }
}
