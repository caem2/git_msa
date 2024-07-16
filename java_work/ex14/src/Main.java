class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //행동하는 메서드(함수)
    public void greeting(){
        System.out.println(name +"hello");
    }

    public void setName(String name) {
        this.name = name;
    }
}
//constructor 로 private 변수를 바꿀수 있다.
//setter 로 private 변수를 바꿀수 있다.
//다른 생성자 선언시에 기본생성자 생략불가
public class Main {
    public static void main(String[] args) {
        //기본생성자 선언 후에 setter 로 변수 name 변경
        Person p1 = new Person();
        // name 을 바꾸는 다른 생성자로 선언해서
        Person p2 = new Person("한민성");
        p1.setName("정채미");

        p1.greeting();
        p2.greeting();

        System.out.println(p1);
        System.out.println(p2);

    }
}