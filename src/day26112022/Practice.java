package day26112022;

public class Practice {
    public static void main(String[] args) {
        try {
            System.out.println("Misstake");
            int a=42/0;
        }
        catch (Exception e){
            System.out.println("Misstake has been caught");
        }
    }

}
