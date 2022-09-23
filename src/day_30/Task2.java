package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfStrings =new ArrayList<>();

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("Chandler","Tempe","Phoenix","Tucson"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Chad","Torrance","Drama","Tibet"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("Apple","Peach","Grapes","Plum"));

        listOfStrings.add(list1);
        listOfStrings.add(list2);
        listOfStrings.add(list3);
        ArrayList<ArrayList<String>> convertedList = getConvertedList(listOfStrings);
        System.out.println("convertedList = " + convertedList);

    }

    static ArrayList<ArrayList<String>> getConvertedList(ArrayList<ArrayList<String>> listOfLists) {

        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.size(); j++) {

                String s = listOfLists.get(i).get(j).toUpperCase();
                listOfLists.get(i).set(j,s);
//                System.out.println(s);

            }
            System.out.println();

        }

        return listOfLists;
    }
}
