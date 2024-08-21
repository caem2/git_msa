package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBRepository {

    public List<Member> select() {

        List<Member> list = new ArrayList<>();
        Connection connection = null;//DB연결객체
        PreparedStatement preparedStatement = null;//sql객체
        ResultSet resultSet = null;//반환되는값 담는 객체

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.95:3307/pmh",
                    "root",
                    "1234");
            preparedStatement = connection.prepareStatement("SELECT * FROM aa");//sql문작성
            //insert update delete -> executeUpdate();
            resultSet = preparedStatement.executeQuery();// sql 실행
            while (resultSet.next()) {
                Member member = new Member();
                member.setAge(resultSet.getInt("age"));
                member.setIdx(resultSet.getInt("idx"));
                member.setEmail(resultSet.getString("email"));
                member.setName(resultSet.getString("name"));
                member.setPassword(resultSet.getString("password"));
                list.add(member);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        } finally {


        }
        return null;
    }
}
