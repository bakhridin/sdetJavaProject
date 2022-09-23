package day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_01_2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Character>>listOfChars =new ArrayList<>();
        listOfChars.add(new ArrayList<>(Arrays.asList('c','a','b','e','y')));
        listOfChars.add(new ArrayList<>(Arrays.asList('m','o','s','k','o','w')));
        ArrayList<ArrayList<Character>> desc = getDesc(listOfChars);
        System.out.println("desc = " + desc);

    }

    static ArrayList<ArrayList<Character>> getDesc(ArrayList<ArrayList<Character>>listOfChars) {

//        for (int i = 0; i < listOfChars.size(); i++) {
//            for (int j = 0; j < listOfChars.size(); j++) {
//
//                Collections.reverse(listOfChars.get(i));
//
//            }
//
//        }
        for (ArrayList<Character> listOfChar : listOfChars) {
          //  Collections.sort(listOfChar);
            Collections.reverse(listOfChar);

       }

        return listOfChars;
    }



}
