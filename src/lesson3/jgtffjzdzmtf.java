package lesson3;

import java.util.Scanner;

public class jgtffjzdzmtf {
    public static void main(String[] args){
            System.out.println("Ведіть пору року");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature>20){
            System.out.println("Вдягніть рубашку");

        }
        else {
            if (temperature > 10) {
                System.out.println("Вдягніть ковту");
            }
        }

          if  (temperature > 0) {
                System.out.println("Вдягніть куртку");
            }
          else {
              if (temperature < 0) {
                  System.out.println("Вдягніть пальто");
              }
          }

}
}
