package day29102022;

public class StringHelper{
    public static void multiply(String s, int count){
      for  (int i=0; i<count; i++){
          System.out.println(s);
      }
    }
    public static void multiply2(String s){
        for (int i=0; i<5; i++){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        multiply2("десять");
        multiply("дев'ять", 9);
    }
}
