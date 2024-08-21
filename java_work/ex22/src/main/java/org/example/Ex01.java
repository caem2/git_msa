package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {

    public static void main(String[] args) {

        Box <Apple> box1 = new Box<Apple>();
        Box <Orange> box2 = new Box<Orange>();

        Box<String> box3 = new Box<>();
        Box<Scanner> box4 = new Box<>();
        Box<StringTokenizer> box5 = new Box<>();

        box1.setObject(new Apple());
        box2.setObject(new Orange());

        Apple apple = box1.getObject();
        Orange orange = box2.getObject();
    }
}