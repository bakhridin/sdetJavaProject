package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfStrings =new ArrayList<>();

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("chandler","tempe","phoenix","tucson"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("chad","torrance","drama","tibet"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("apple","peach","grapes","plum"));

        listOfStrings.add(list1);
        listOfStrings.add(list2);
        listOfStrings.add(list3);

        ArrayList<ArrayList<String>> arrayLists = toCamelCase(listOfStrings);
        System.out.println("arrayLists = " + arrayLists);
    }

    static ArrayList<ArrayList<String>> toCamelCase(ArrayList<ArrayList<String>> listOfLists) {

        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.size(); j++) {

                String s = listOfLists.get(i).get(j);
                s= s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();

                listOfLists.get(i).set(j,s);


            }

        }

        return listOfLists;
    }
}
