package org.example;

public class Ex04 {

    public static int doA(){
        try{
            int a = 10;
            int b = 3;

            return a/b;
        }catch (Exception e){
            System.out.println("예외");
            return 0;
        }
        finally {
            System.out.println("무조건");
        }
    }

    public static void main(String[] args) {
        System.out.println(doA());
    }
}
