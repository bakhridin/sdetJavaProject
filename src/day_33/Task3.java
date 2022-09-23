package day_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 75000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        // Task 1
        /*
        Create a method, which will return a map with position as a key, and total compensation as value
        Manager = 270000
        Ceo = 525000
        etc...
         */
        ArrayList<Integer>ls=new ArrayList<>(Arrays.asList(100,200,300,400));
        int total = total(ls);
        System.out.println("total = " + total);

        System.out.println("======used entrySet()-method=========");
        HashMap<String, Integer> comps = getComps(compensation);
        System.out.println("comps = " + comps);

        System.out.println("======used keySet()-method=========");
        HashMap<String, Integer> compensation1 = getCompensation(compensation);
        System.out.println("compensation1 = " + compensation1);


    }

    static int total(ArrayList<Integer> number) {
        int total=0;
        for (Integer integer : number) {
            total+=integer;

        }
        return total;

    }

    static HashMap<String, Integer> getComps(HashMap<String, ArrayList<Integer>> compensation) {
        HashMap<String,Integer>totalOfComps=new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : compensation.entrySet()) {
 //           if (entry.getKey().equals("CEO")) {
                totalOfComps.put(entry.getKey(),total(entry.getValue()));
 //           }

        }

        return totalOfComps;
    }

    static HashMap<String, Integer> getCompensation(HashMap<String,ArrayList<Integer>>numbers) {
        HashMap<String,Integer>totalOfCompensations=new HashMap<>();
        for (String key : numbers.keySet()) {
            totalOfCompensations.put(key,total(numbers.get(key)));
        }

        return totalOfCompensations;

    }
}
