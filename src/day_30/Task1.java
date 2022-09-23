package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfStrings =new ArrayList<>();

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("Chandler","Tempe","Phoenix","Tucson"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Chad","Torrance","Drama","Tibet"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("Apple","Peach","Grapes","Plum"));

        listOfStrings.add(list1);
        listOfStrings.add(list2);
        listOfStrings.add(list3);

        for (ArrayList<String> listOfString : listOfStrings) {
            for (String s : listOfString) {
                System.out.print(s+" ");
            }
            System.out.println();

        }
        System.out.println("=================================");

        System.out.println(listOfStrings);

        System.out.println("==================================");

        listOfStrings.forEach(str-> System.out.println(str+" "));
    }
}
