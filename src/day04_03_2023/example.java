package day04_03_2023;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class example {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInput = reader.readLine();

        FileInputStream inputStream = new FileInputStream("111.txt");
       int max = Integer.MIN_VALUE;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if(max < data){
                max = data;
            }
        }

System.out.println(max);
        inputStream.close();
    }
}
