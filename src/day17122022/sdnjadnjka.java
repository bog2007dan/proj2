package day17122022;

import java.util.Scanner;

public class sdnjadnjka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String g = scanner.nextLine();
        StringBuffer strBuffer = new StringBuffer(g);
        int s=3;
        int b=10;
        char[] buffer= new char [b-s];
        strBuffer.getChars(s,b,buffer, 0);
        System.out.println(buffer);
    }
}
