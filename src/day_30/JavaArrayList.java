package day_30;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> listOfList =new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11,22,33,44,55));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100,200,300,400,500));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j < listOfList.size(); j++) {

                System.out.print(listOfList.get(i).get(j)+" ");

            }
            System.out.println();

        }



    }
}
