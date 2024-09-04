package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter("mtfile"));
        bw.write("바보");
        bw.newLine();
        bw.close();
    }
}