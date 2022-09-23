package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ExampleToRemoveDuplicates {

    public static void main(String[] args) {
        // To remove all duplicates from the list, by using hashset
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,1,1,1,4,4,4,4,2,2,2,2,8,8,8,8,8,12,12,12));
        HashSet<Integer>set=new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);
    }
}
