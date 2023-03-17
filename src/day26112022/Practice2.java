package day26112022;

import java.lang.reflect.Array;

public class Practice2 {
    public static void main(String[] args) {
        try {
            System.out.println("Misstake");
  int[] m = new int[2];
m[8]=5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Misstake has been caught");
        }
    }
}
