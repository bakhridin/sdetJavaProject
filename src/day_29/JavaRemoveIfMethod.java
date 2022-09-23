package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaRemoveIfMethod {


    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("java","new jersey","nowak","new york","toronto","canada"));


        System.out.println("list = " + list);

       list.removeIf((str) -> str.startsWith("n"));
        System.out.println("list = " + list);

        ArrayList<String > list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println("list1 = " + list1);

        ArrayList<String > list2;
        list2=list;
        System.out.println("list2 = " + list2);
        list2.set(0,"london");
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);




    }
}
