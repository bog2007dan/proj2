package day2122022;

import java.util.stream.IntStream;

import static java.lang.Thread.*;

public class laflfa {

    public static void main(String[] args) throws InterruptedException {
        try {
            int[] numbers = new int [11];
            for(int i=10; i<numbers.length; i--){
                sleep(200);
                numbers[i] = i-1;
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println("Misstake has been caught");
            }

    }
}

