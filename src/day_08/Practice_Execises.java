package day_08;

import java.util.Arrays;

public class Practice_Execises {

    public static void main(String[] args) {
        String text="Java Exercises for Mentoring Session";

        int i = text.indexOf('E');
        System.out.println("i = " + i);

        char e = text.charAt(5);
        System.out.println("e = " + e);

        boolean mentor = text.toLowerCase().contains("mentor");
        System.out.println("mentor = " + mentor);

        int indexOfe1 = text.indexOf('e',13);
        System.out.println("indexOfe1 = " + indexOfe1);

        int i1 = text.lastIndexOf("i");
        System.out.println("i1 = " + i1);

        String[] split = text.split("[ ]", 5);
        System.out.println(Arrays.toString(split));


    }
}
