package day_09;

import java.util.Scanner;

public class MentoringClass2 {
    public static void main(String[] args) {
        /**
         * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
         *
         *
         * nonStart("Hello", "There") → "ellohere"
         * nonStart("java", "code") → "avaode"
         * nonStart("shotl", "java") → "hotlava"
         *
        *
         * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
         * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
         *
         *
         * seeColor("redxx") → "red"
         * seeColor("xxred") → ""
         * seeColor("blueTimes") → "blue"
         * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
         *

         *
         *
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first String");
        String s1 = scan.nextLine();

        System.out.println("Please enter second String");
        String s2 = scan.nextLine();

        s1=String.valueOf(s1.charAt(0));

        System.out.println(""+s1.charAt(0));




    }
}
