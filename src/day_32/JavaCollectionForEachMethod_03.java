package day_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class JavaCollectionForEachMethod_03 {
    public static void main(String[] args) {
        System.out.println("=============Array List=============");
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(5,3,2,5,6,7,4,3,9,-2));
        System.out.println(list);
        list.forEach(number->{number+=10;
            System.out.print(number+" ");});
        System.out.println();

        System.out.println("=============LinkedHashSet=============");
        LinkedHashSet<Integer>set=new LinkedHashSet<>(Arrays.asList(5,3,4,2,1,12,3,15,-2));
        System.out.println(set);

       set.forEach(num->
       {if(num<10)
           System.out.print(num+" ");

       });


    }
}
