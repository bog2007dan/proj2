package lesson6;

public class java3 {
    public static void main(String[] args) {
        int a=10;
        int b=34;
        int m=min(a,b);
        System.out.println("Minimum is" + m);
    }

    public static int min(int c, int d) {
        int m2;
        if(c<d){
            m2=c;
        }
        else {
            m2=d;
        }
        return m2;
    }
}
