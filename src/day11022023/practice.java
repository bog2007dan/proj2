package day11022023;
import java.util.Set;
import java.util.HashSet;

public class practice {
    public static void main(String[] args) {
        Set<String> essen = new HashSet<>();
     essen.add("кавун");
        essen.add("банан");
        essen.add("вишня");
        essen.add("груша");
        essen.add("диня");
        essen.add("ожина");
        essen.add("женьшень");
        essen.add("суниця");
        essen.add("ірис");
        essen.add("картопля");
        for(String esse : essen){
            System.out.println(esse);
        }
    }
}

