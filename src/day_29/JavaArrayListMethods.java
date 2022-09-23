package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethods {



    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>(Arrays.asList("aba","ddd","oop"));
        list.add("xyz");
        list.add(0, "job");
        System.out.println("list = " + list);

        ArrayList<String>list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add("newtext");
        System.out.println("list2 = " + list2);

        ArrayList<String>list3 = new ArrayList<>();

        for (String s : list2) {
            list3.add(s);

        }
        System.out.println("list3 = " + list3);

    }
}
