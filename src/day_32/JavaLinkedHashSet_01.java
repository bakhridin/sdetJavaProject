package day_32;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet_01 {
    /*
      If you want to maintain insertion order of elements
      then you can use LinkedHashSet
      maintains insertion order of objects
       */
    public static void main(String[] args) {

        HashSet<Integer>hset=new HashSet<>(Arrays.asList(5,3,2,4,3,1,2,3,2,1,21));
        System.out.println("hset = " + hset);

        LinkedHashSet<Integer>lhs=new LinkedHashSet<>(Arrays.asList(5,3,2,4,3,1,2,3,2,1,21));
        System.out.println("lhs = " + lhs);

        System.out.println("==========================");
        lhs.add(7);
        lhs.add(8);
        lhs.add(9);

        lhs.forEach(num->{
            if (num<=10) {
                System.out.print(num+" ");
            }});
    }
}
