package day_31;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSetAddAll {
    public static void main(String[] args) {

        HashSet<Integer>set1=new HashSet<>(Arrays.asList(1,2,3,4,5,8,9));
        HashSet<Integer>set2=new HashSet<>(Arrays.asList(6,7,8,9,10));

        set1.addAll(set2);
        System.out.println(set1);




    }
}
