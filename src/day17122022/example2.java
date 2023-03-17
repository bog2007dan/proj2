package day17122022;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t= scanner.nextLine();
        StringBuffer strBuffer = new StringBuffer(t);
        char s=strBuffer.charAt(5);
        System.out.println(t.replace(s, 'A'));
    }
}
