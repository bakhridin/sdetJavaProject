package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSets_02 {
    public static void main(String[] args) {
        HashSet<Integer>set =new HashSet<>();

        Set<Integer> set1=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        ArrayList<Integer> list =new ArrayList<>();

        System.out.println("=======================================");

        HashSet<String> sett = new HashSet<>(Arrays.asList("new", "york", "toronto", "london", "york", "london"));
        sett.add("moscow");

        ArrayList<String> list1 =  new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "frog"));

        HashSet<String> set2 = new HashSet<>(list1);

        System.out.println(set);
        System.out.println(set2);


    }
}
