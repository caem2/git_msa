package ee;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String age_type = scanner.next();
        int answer = 0;

        if (age_type.equals("Korea")){
            answer = 31;
        } else if (age_type.equals("year")) {
            answer = 31;
        }
    }
    }
