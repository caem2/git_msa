package org.example;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

    private MemberRepository memberRepository =
            new MemberRepository();

    public  static Member member;

    Ex10(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                뭐할래?
                0. 로그인
                1. member select()
                2. member insert()
                3. member update()
                4. member delete()
                5. todo select() -> user 사용자
                6. todo insert() -> user 정보...
                7. todo update()
                8. todo delete()
                """);
            int ra = scanner.nextInt();

            if (ra == 0) {
                System.out.println("어떤 사용자 할래? 몇번");
                int member_idx = scanner.nextInt();
                member = memberRepository.findByIdx(member_idx);
                if (member==null){
                    System.out.println("로그인실패");
                }else {
                    System.out.println("로그인성공");
                }
            } else if (ra == 1) {
                memberRepository.insert();
            }else if (ra == 2){
                memberRepository.insert();
            }
            else{
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Ex10();
    }

}
