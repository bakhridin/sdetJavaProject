package Saturday_Project_09_17_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /*
      Task 5
            Create a method that has two Arraylists of Strings as a parameter and return ArrayList of Strings

            take as first value for the new list the first value from the first list
            take as next value for the new list the first value from the second list
            take as next value for the new list the second value from the first list …
            until all values from both lists are in the new list.

            Example:
            Given two lists of same size,
            list1 = [“a”, “b”, “c”] and list2 = [“x”, “y”, “z”]

            result list should be = [“a”,”x”,”b”,”y”,”c”,”z”]

            Example:
            Given two lists of different size
            list1 = [“a”, “b”, “c”, “x”] and list2 = [“y”, “z”]

            result list should be = [“a”,”y”,”b”,”z”,”c”,”x”]
     */

    public static void main(String[] args) {

        ArrayList<String> str1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("x","y","z"));

        ArrayList<String> mixedList = getMixedList(str1, str2);
        System.out.println("mixedList = " + mixedList);
    }

    static ArrayList<String> getMixedList(ArrayList<String> str1,ArrayList<String> str2) {
        ArrayList<String>newStr=new ArrayList<>();
//        for (int i = 0; i < str1.size(); i++) {
//            for (int j = 0; j < str2.size(); j++) {
//             newStr.add(str1.get(i)+str2.get(j));
//            }
//        }
        for (int i=0;i<Math.min(str1.size(),str2.size());i++){
            newStr.add(str1.get(i));
            newStr.add(str2.get(i));

            if (str1.size()>str2.size()) {
                for (int j=str2.size();j<str1.size();j++){
                    newStr.add(str1.get(j));
                }
            }
            else if(str1.size()<str2.size()){
                for (int j=str1.size();j<str2.size();j++){
                    newStr.add(str2.get(j));
                }

            }

        }

        return newStr;
    }
}
