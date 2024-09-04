package org.example;

import java.io.*;

class MyObjct implements Serializable {
    private String test = "aaa";

    public String getTest() {return test;}
    public void setTest(String test) {this.test = test;}
}

public class Ex01 {
    public static void main(String[] args) throws Exception{

//        ObjectOutputStream
//                oos = new ObjectOutputStream(new FileOutputStream("d:/a/odj"));
//
//        oos.writeObject(new MyObjct());
//
//        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("d:/a/odj"));

        Object aaa = ois.readObject();
        MyObjct mo = (MyObjct) aaa;

        System.out.println(mo.getTest());
    }
}
