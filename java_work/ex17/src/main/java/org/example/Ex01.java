package org.example;

import org.example.phone.Mobilphone;
import org.example.phone.SmartPhone;

public class Ex01 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("5.0",12345678);
        smartPhone.show();

        System.out.println();
        Mobilphone mobilphone =
                new Mobilphone(123456);
        mobilphone.show();
    }
}
