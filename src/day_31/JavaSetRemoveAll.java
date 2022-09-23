package day_31;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSetRemoveAll {
    public static void main(String[] args) {

        HashSet<Integer>set3=new HashSet<>(Arrays.asList(1,2,3,4,5,8,9));
        HashSet<Integer>set4=new HashSet<>(Arrays.asList(6,7,8,9,10));

        set4.removeAll(set3);
        System.out.println(set4);


        System.out.println("===============================");

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,4,5,6,7));

        set2.removeAll(set1);
        System.out.println(set2);


    }
}
