package package1;

import java.util.Arrays;

public class jankdalsjdakdlklas {
    public static void main(String[] args) {
        int a=501614;
        int t=124458;
        int b=456456;
        int r=1238936;
        int m=min(a,t,b,r);
        System.out.println("Minimum is" + m);
    }

    public static int min(int c, int d, int s, int y) {
        int m2=0;
        if (c < d) {
            m2 = c;
        } else if (c > d) {
            m2 = d;
        } else if (d > s) {
            m2 = s;
        } else if (d < s) {
            m2 = d;
        } else if (s > y) {
        m2 = y;
    } else if (s < y) {
        m2 = s;
    }
        return m2;
    }
}
