package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

    public static void main(String[] args) {
        try (
            OutputStream os = new FileOutputStream("copyfile");
            InputStream is = new FileInputStream("myfile")
        ){
            while (true){
                int date = is.read();
                if (date == -1)
                    break;
                os.write(date);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
