package package1;

public class efmklamk {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 23, 234, 13123};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        int[] numbers2 = new int [10];
        for(int e=0; e<numbers2.length; e++){
            numbers2[e] = 9-e;
            System.out.println(numbers2[e]);

        }
         int t = 2;
         while (t<=100){
             System.out.println(t++);
              t++;
            }
         String s="N";
         int y = 10;
         while (y>=0) {
           System.out.println(s);
         y--;
           }
        int u = 24;
        int k = 5;
        int l = 9;
        int m = 54;
        int n = 27;
        int result = (u * k + l) - (m / n);
        System.out.println(result);
         String name = "Bohdan's age is ";
         int age = 15;
        System.out.print(name);
         System.out.println(age);
    }
}
