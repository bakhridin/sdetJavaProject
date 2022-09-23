package day_33;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        Set<Map.Entry<String, ArrayList<Integer>>> entries = compensation.entrySet();
        System.out.println("entries = " + entries);

        System.out.println("==========================");

        HashMap<String,Integer>list=new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> stringArr : compensation.entrySet()) {
            int total=0;
            for (int i = 0; i < stringArr.getValue().size(); i++) {
                total+=stringArr.getValue().get(i);

            }
               list.put(stringArr.getKey(),total);

        }
        System.out.println("list = " + list);


    }


}
