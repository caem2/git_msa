package org.example;

public class Car implements  Comparable<Car>{

    private String name;
    private  int disp;

    // 생성자, 게터세터 , 투스트링

    public Car(String name, int disp) {
        this.name = name;
        this.disp = disp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisp() {
        return disp;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", disp=" + disp +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
