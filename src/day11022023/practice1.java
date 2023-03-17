package day11022023;

import java.util.Scanner;
import java.util.TreeSet;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> a = new TreeSet<>();
        a.add(0);
        a.add(545);
        a.add(16);
        a.add(14);
        a.add(8);
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        for (Integer s : a){
            if (s >= 1 && s < 15){
                System.out.println(s);
            }
        }

    }
}
