package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {



    /*
            1. Class.forname jar 파일추가 확인
            2. Connection DB연결
            3. PrepareStatement sql구문작성
            4. sql구문 실행
         */
    public void insert() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                    "root",
                    "1234");
                preparedStatement = connection.prepareStatement("INSERT INTO aa (name,age) VALUES (?,?)");
            String name = JOptionPane.showInputDialog("이름");
            preparedStatement.setString(1,name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            preparedStatement.setInt(2,age);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {}
        }
    }
    public void delete() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                    "root",
                    "1234");
            preparedStatement = connection.prepareStatement("DELETE FROM member where idx = ?;");

            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            preparedStatement.setInt(1,idx);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {}
        }
    }
    public void select(){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        // select 해서 반환되는 테이블 받기
        ResultSet rs = null;


        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                    "root",
                    "1234");
            preparedStatement = connection.prepareStatement("SELECT * FROM aa");


            rs = preparedStatement.executeQuery();
            while (rs.next()){
//                System.out.println("idx = "+rs.getInt("idx"));
//                System.out.println("name"+rs.getString("name"));
//                System.out.println("age"+rs.getInt("age"));

                System.out.println("""
                        idx = %d
                        name = %s
                        age = %d
                        """.formatted(rs.getInt("idx"),
                                        rs.getString("name"),
                                        rs.getInt("age")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {}
        }
    }
    public void update() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                    "root",
                    "1234");
            preparedStatement = connection.prepareStatement("UPDATE aa SET NAME=?,age=? WHERE idx=?");
            String name = JOptionPane.showInputDialog("이름");
            preparedStatement.setString(1, name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            preparedStatement.setInt(2, age);

            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            preparedStatement.setInt(3,idx);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {
            }
        }
    }
}