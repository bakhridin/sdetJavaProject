package day_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 75000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));



        System.out.println("=====keySet()-method=========");
        for (String key : compensation.keySet()) {
            if (key.equals("Manager")) {
                System.out.println(compensation.get(key));
            }
        }



        System.out.println("=====entrySet()-method=========");
        for (Map.Entry<String, ArrayList<Integer>> entry : compensation.entrySet()) {
            HashMap<String,Integer>map1=new HashMap<>();
            if (entry.getKey().equals("CEO")) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                map1.put(entry.getKey(),total(entry.getValue()));
                System.out.println("Total compensation for CEO is "+map1);
            }

        }

    }

    static int total(ArrayList<Integer> number) {
        int total=0;
        for (Integer integer : number) {
            total+=integer;

        }
        return total;

    }
}
