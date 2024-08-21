package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {

    /*
    1.insert
    2.select
    3.update
    4.delete
     */
    public void insert(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("이름입력");
            String name = scanner.next();
            System.out.println("나이입력");
            int age = scanner.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager
                            .getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                                    "root",
                                    "1234");
            System.out.println("연결성공");

            PreparedStatement preparedStatement
                    = connection.prepareStatement("INSERT INTO aa (name,age) VALUES (?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void select(){
        System.out.println("select로 해야함");
    }
}
