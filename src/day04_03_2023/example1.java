package day04_03_2023;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class example1 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
     String text = "Hello Smart";
     byte[] buffer = text.getBytes();
     try {
         baos.write(buffer);
     }
         catch (IOException e){
         throw new RuntimeException(e);
         }
     try(FileOutputStream fos = new FileOutputStream("rrr.txt")){
         baos.writeTo(fos);
     }
     catch (IOException e){
         e.printStackTrace();
     }
        }
    }
