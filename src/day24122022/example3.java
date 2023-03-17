package day24122022;

import java.util.ArrayList;
import java.util.List;

public class example3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("12");
        list.add("14");
        list.add("41");
        list.add("9283");
        list.add("2222");
        System.out.println(list.size());
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.println(list.get(i) + "");
        }
    }
}
