package day14012023;

import java.util.ArrayList;
import java.util.List;
public class project2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("forth");
        list.add("five");
        System.out.println("SIZE " + list.size());
        list.add(0,list.get(list.size()-1));
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
