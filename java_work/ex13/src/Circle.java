class Circle {
    // private 변수는 setter getter로 참조 가능
    private int rad;
    private String name;
    //기본생성자는 생략가능
    //다른생성자는 선언시 기본생성자 생략불가


    // alt + insert키 누르고 getter setter constuctor생성가능
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;
    }

    // 이 함수를 통해서 반지름 넣는 것만 해라
    public void setRad(int r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public int getRad() {
        return rad;

    }
}
