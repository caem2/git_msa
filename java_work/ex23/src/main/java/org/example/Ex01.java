package org.example;

public class Ex01 {

    public static void main(String[] args) {
        BoxFactory.peekBox4(new Box<>(new AA()));
        BoxFactory.peekBox4(new Box<>(new BB()));
        BoxFactory.peekBox4(new Box<>(new CC()));

        //이건 안됨
       // BoxFactory.peekBox4(new Box<>(new Object()));

        BoxFactory.peekBox5(new Box<>(new Object()));
        BoxFactory.peekBox5(new Box<>(new AA()));
        BoxFactory.peekBox5(new Box<>(new BB()));

       // BoxFactory.peekBox5(new Box<>(new CC()));

    }
}
