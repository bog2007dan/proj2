package day_25_02_2023;

import java.io.*;

public class example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInput = reader.readLine();
        String fileOutput = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileInput);
        FileOutputStream outputStream = new FileOutputStream(fileOutput);


    while (inputStream.available() > 0){
        int data = inputStream.read();
        outputStream.write(data);
    }


    inputStream.close();
    outputStream.close();
    }
}
