package aa;

//클래스 정의
public class Box {
    String name;
    int count;

    //기본생성자는 생략가능 하지만
    //다른생성자를 선언할시 기본생성자 생략 불가
    public Box(){ System.out.println("기본생성자 호출");}
    public Box (String n){
        name = n;
        System.out.println("n 다른생성자 호출");
    }
    public Box (String n,int c){
        name = n;
        count = c;
        System.out.println("n c 다른생성자 호출");
    }
    //생략..
    //개발자 프로그래머가 직접 적게되면 내용이 바뀜
    public String toString(){
        return "Box name ="+ name;
    }
    // 메서드 이름이 동일할 수 없다
    //String 넣으면댐
    public void doA(){}
    public  void doA(String a){}
}

