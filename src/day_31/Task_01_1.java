package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_01_1 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>listOfList=new ArrayList<>();

//        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(100,20,30));
//        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(15,25,80));
//        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(40,60,5));

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(-100,-20,-30));
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(-15,-25,-80));
        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(-40,-60,-5));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);
        int max = getMax(listOfList);
        System.out.println("max = " + max);



    }

   // ArrayList<ArrayList<Integer>>listOfList=new ArrayList<>();

    static int getMax(ArrayList<ArrayList<Integer>>listOfList) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j < listOfList.size(); j++) {

             //   max= max>Collections.max(listOfList.get(i))? max:Collections.max(listOfList.get(i));
                if (max>Collections.max(listOfList.get(i))) {
                    max=max;
                }else{
                    max=Collections.max(listOfList.get(i));
                }

            }

        }
        return max;

    }
}
