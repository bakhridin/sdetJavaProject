package Saturday_Project_09_17_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    /*
     Task 7
            Create a method that has an Arraylists of Integer as a parameter.

            Remove all duplicates and return new ArrayList of Integer

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            [1,2,3,4,5,6]
     */
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        for (Integer removeDuplicate : removeDuplicates(list)) {
            System.out.println("removeDuplicate = " + removeDuplicate);
        }

    }

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer>list) {
        Collections.sort(list);
       // ArrayList<Integer>newList=new ArrayList<>();
        for (int i = list.size()-1; i >0 ; i--) {
            if (list.get(i).equals(list.get(i-1))) {
                list.remove(i);
            }

        }
        return list;
    }
}
