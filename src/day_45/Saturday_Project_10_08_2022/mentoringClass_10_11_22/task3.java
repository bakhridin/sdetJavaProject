package day_45.Saturday_Project_10_08_2022.mentoringClass_10_11_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class task3 {


//    public static int repeatElement(ArrayList<Integer> list) {
//        int result=0;
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 1; j < list.size(); j++) {
//                if (list.get(i) != list.get(j)  ) {
//                    result=list.get(i);
//                }
//            }
//        }
//        return result;
//
//    }

    static int singleNumber(int[]arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }
        for (Integer integer : set) {
            return integer;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]arr={1,2,5,2,1};
        int i = singleNumber(arr);
        System.out.println(i);

    }

}
