package day_33;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapLoopsEntrySet_02 {
    public static void main(String[] args) {

        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("entries = " + entries);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            System.out.println("value = " + value);
        }


    }
}
