package day_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSets_02_3 {
    public static void main(String[] args) {
        HashSet<Integer>set =new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        Set<Integer> set1=new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(3);
        set1.add(4);
        set1.add(4);
        set1.add(5);
        set1.add(5);
        set1.add(10);
        System.out.println(set1);

        int size = set1.size();
        System.out.println(size);




        ArrayList<Integer> list =new ArrayList<>();




    }
}
