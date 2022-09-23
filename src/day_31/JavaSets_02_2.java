package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSets_02_2 {
    public static void main(String[] args) {


        Set<String> set1=new HashSet<>(Arrays.asList("new","york","london","moscow"));


        ArrayList<String> list =new ArrayList<>(Arrays.asList("dog","cat","mouse","frog"));

        HashSet<String> list2=new HashSet<>(list);
        System.out.println(list2);


    }
}
