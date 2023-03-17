package day24122022;

import java.util.ArrayList;
import java.util.List;

public class example4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"12");
        list.add(1,"14");
        list.add(2,"41");
        list.add(3,"9283");
        list.add(4,"2222");
        list.add(5,"3");
        list.add(6,"74");
        list.add(7,"91");
        list.add(8,"22");
        list.add(9,"55");
        for (int i=list.size()-1; i>0; i--){
            System.out.println(list.get(i)+ "");
        }
    }
        }

