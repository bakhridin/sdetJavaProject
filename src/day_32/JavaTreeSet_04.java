package day_32;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaTreeSet_04 {
    public static void main(String[] args) {
 /*
        If you want to sort the elements
        according to some Comparator then
        use TreeSet
        objects will be placed in their natural
        ascending order
         */
        LinkedHashSet<Integer> set=new LinkedHashSet<>(Arrays.asList(5,3,4,2,1,12,3,15,-2));
        TreeSet<Integer>tSet=new TreeSet<>(set);
        System.out.println(tSet);

        tSet.forEach(setNum->{
            if (setNum>0) {
                System.out.println(setNum);
            }else {
                System.out.println("Numbers are not greater than zero");
            }

        });
    }
}
