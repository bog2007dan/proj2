public class cat {


public static class cat2{
    public static int catCount=0;
    public cat2(){catCount++;}
}
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            cat2 cat= new cat2();
        }
        System.out.println(cat2.catCount);
    }
}
