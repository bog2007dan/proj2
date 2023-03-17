package hausaufgabe1;

import java.util.HashMap;
import java.util.Map;
public class practice1 {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap();
        a.put(0, "1");
        a.put(545, "2");
        a.put(16, "3");
        a.put(14, "4");
        a.put(8, "5");
        a.put(2, "6");
        a.put(63, "7");
        a.put(20, "8");
        a.put(100, "9");
        a.put(45, "10");
        for(Map.Entry<Integer, String> entry: a.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        }

    }

