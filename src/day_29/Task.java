package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("java","is","fun.","i","love","java"));

//        list.removeIf((str) -> str.length()<3);
//        System.out.println(list);

       arrList(list);

    }

    static ArrayList<String> arrList(ArrayList<String> list) {

        for (int i = 0; i <list.size() ; i++) {

            int size = list.get(i).length();

            if( size<= 3 ){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
        return list;

    }
}
