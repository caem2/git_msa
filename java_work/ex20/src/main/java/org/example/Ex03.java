package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex03 {
    public static void main(String[] args) {
        Path file = Paths.get("d:\\simple.txt");

        BufferedWriter writer = null;
        
        try {

            writer.write('A');
            writer.write("문자열");
            
            if (writer!=null)
                writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
