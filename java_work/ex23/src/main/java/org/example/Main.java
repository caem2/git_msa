package org.example;

public class Main {

    public static void main(String[] args) {
//        Box<String> steelBox = new SteelBox<>();
//        steelBox.setT("test");
//
//        System.out.println(steelBox.getT());
        BoxFactory.<Integer>peekBox(new Box<>(10));
        BoxFactory.peekBox2(new Box<>(20.3d));
//        BoxFactory.peekBox2(new Box<>("스트링 넣고 싶다"));

    }
}