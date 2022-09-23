package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaRemoveAllMethod {

    public static void main(String[] args) {

//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,11,13,15));
//        System.out.println("list1 = " + list1);
//        System.out.println("list2 = " + list2);
//
//        list1.removeAll(list2);
//
//        System.out.println("list1 = " + list1);
//        System.out.println("list2 = " + list2);

//        Task 3
//        Create a method which will take two lists as parameter and return
//                a new list with all values of the first list that are not in the second list.
//        Return ArrayList
//
//        Example:
//
//        Input:
//             [1, 2, 3, 4] and [1, 4, 5, 9]
//
//        Output:
//             [2, 3]

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 5, 9));

        ArrayList<Integer> integers = newListOfValues(list1, list2);
    }

    static ArrayList<Integer> newListOfValues(ArrayList<Integer> list1,ArrayList<Integer> list2) {
        ArrayList<Integer>list3=new ArrayList<>();
      list1.removeAll(list2);
       return list3;

    }
}
