package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollectionMethods_01 {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(21,22,23,34,35));

        Collections.fill(list,10);
        System.out.println(list);

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(21,22,23,34,35,-4));
        Integer max = Collections.max(list1);
        System.out.println("max = " + max);

        Integer min = Collections.min(list1);
        System.out.println("min = " + min);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","is","Fun"));
        String max1 = Collections.max(list2);
        System.out.println("max1 = " + max1);

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

    }
}
