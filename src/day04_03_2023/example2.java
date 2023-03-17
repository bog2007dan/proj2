package day04_03_2023;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class example2 {
    public static void main(String[] args) {
        String text = "Hallo SmartIT";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
        try(BufferedInputStream bis = new BufferedInputStream(in)){
            int c;
            while((c = bis.read())!= -1){
                System.out.println((char)c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
