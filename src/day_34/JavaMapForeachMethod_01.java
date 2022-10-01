package day_34;

import java.util.HashMap;

public class JavaMapForeachMethod_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        //foreach entrySet

       map.forEach((keys,values) -> System.out.println("keys = " + keys+" values "+values));

       map.forEach((key,value)->{
           if (key.equals("a")) {
               System.out.println(key+" "+ value);
           }});
    }
}
