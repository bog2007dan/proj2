package day21012023;
import java.util.Queue;
import java.util.LinkedList;

public class example1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("London");
        queue.offer("Manchester");
        queue.offer("Liverpool");
        queue.offer("Brighton");
        System.out.println(queue.peek());
        System.out.println();
        String town;
        while ((town = queue.poll()) !=null) {
    System.out.println(town);
        }
    }
}
