package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) {

        try {
            //jar 파일 추가확인
            Class.forName("com.mysql.jdbc.Driver");
            // db연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
            // sql 구문 만들기
            PreparedStatement pstmt = conn.prepareStatement("create table test (aa varchar(255), bb varchar(255))");
            // sql 구문 실행
            pstmt.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}