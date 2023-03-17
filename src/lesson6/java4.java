package lesson6;

public class java4 {
        public static void main(String[] args) {
            int a=780;
            int t=67;
            int b=1907;
            int m=min(a,t,b);
            System.out.println("Minimum is" + m);
        }

        public static int min(int c, int d, int s) {
            int m2=0;
            if (c < d) {
                m2 = c;
            } else if (c > d) {
                m2 = d;
            } else if (d > s) {
                m2 = s;
            } else if (d < s) {
                m2 = d;
            }
            return m2;
        }

}
