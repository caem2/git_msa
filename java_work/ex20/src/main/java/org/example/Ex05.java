package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex05 {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/aaa","root","1234");
            System.out.println("ㅇㅇ");

            PreparedStatement preparedStatement
                    = connection.prepareStatement("INSERT INTO student valuse()" );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
