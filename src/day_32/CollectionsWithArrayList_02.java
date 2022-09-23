package day_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsWithArrayList_02 {
    public static void main(String[] args) {

        ArrayList<Integer>list =new ArrayList<>(Arrays.asList(5,3,2,5,6,7,4,3,9,-2));
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);

        System.out.println("Min num is "+min+" Max num is "+max);

        list.forEach(num->{
            if (num<0) {
                System.out.println(num);
            }});

    }
}
