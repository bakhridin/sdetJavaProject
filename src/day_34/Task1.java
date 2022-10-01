package day_34;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);
        printMap(map);

    }

    static void printMap(HashMap<String, Integer> map ) {
        map.forEach((key,value)->{{
            if (key.equals("a")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("b")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("c")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("d")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("e")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("f")) {
                map.put(key,map.get(key)+value);
            }else  if (key.equals("g")) {
                map.put(key,map.get(key)+value);
            }
            System.out.println(key+" = "+map.get(key));
        }});

    }

}
