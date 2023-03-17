package day04_03_2023;

import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class example3 {
    public static void main(String[] args) {
        String text = "Hello SmartIT";
        try(FileOutputStream out = new FileOutputStream("note.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out)){
    byte[] buffer = text.getBytes();
    bos.write(buffer, 0, buffer.length);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
