package org.example;

import org.example.box.Box;
import org.example.box.GoldBox;
import org.example.box.PaperBox;

public class Ex04 {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldBox box3 = new GoldBox();
        
        weapBox(box1);
        weapBox(box2);
        weapBox(box3);
    }

    private static void weapBox(Box box) {
        if(box instanceof GoldBox)
            ((GoldBox)box).goldbox();
        else if (box instanceof PaperBox)
            ((PaperBox)box).paprtbox();
        else
            box.box();

    }
}
