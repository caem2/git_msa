package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {

        List<Car> list = Arrays.asList(
                new Car("그랜저",3000),
                new Car("k8",3500),
                new Car("쏘렌토",2200)
        );

        for (Car car : list){
            System.out.println(car);
        }
        System.out.println(0);

//        Collections.sort(list, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.getDisp() - o2.getDisp();
//            }
//        });

        Collections.sort(list,(((o1, o2) -> o2.getDisp() - o1.getDisp())));

        System.out.println();
        for (Car car : list){
            System.out.println(car);
        }
    }
}
