package day24122022;

import java.util.ArrayList;
import java.util.List;

public class example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("12");
        list.add("14");
        list.add("41");
        list.add("9283");
        list.add("2222");
        list.add("998");
        list.add("1992");
        list.add("2782");
        list.add("0");
        list.add("2022");
        for (int i=list.size()-1; i>0; i--){
        System.out.println(list.get(i)+ "");
    }
    }
}
