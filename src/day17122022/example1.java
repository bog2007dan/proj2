package day17122022;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        String t= scanner.nextLine();
        StringBuffer strBuffer = new StringBuffer(s);
        System.out.println(strBuffer.append(t));
    }
}
