package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("TOY");
        list.add("ROBOT");
        list.add("BOX");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        Person p1 = new Person("홍길동",20);
        Person p2 = new Person("김길동",40);

        System.out.println(p1);
        System.out.println(p2);



    }
}
