package day2211;

public class Practice {
    public static void main(String[] args) {
        GenericStatic genericStatic = new GenericStatic();
        genericStatic.someStaticMethod(3);

    }
}
        class GenericStatic{
            public static Object someStaticMethod(Object object){
                System.out.println(object);
                return object;
            }
        }
