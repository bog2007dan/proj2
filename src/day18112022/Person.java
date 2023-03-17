package day18112022;

public class Person implements Person1{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.IsAlive();
    }

    @Override
    public boolean IsAlive() {
        return false;
    }
}
