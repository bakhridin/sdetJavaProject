package day_19.mentoring_09_02_2022;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        /*Task1
         * Write a Java program to find
         * the number of even and odd integers
         *  in a given array of integers {25, 71, 0, 40, 99};
         * */

//        int[] num= {25,71,0,40,99};
//        int evNumbers=0;
//        int oddNumbers=0;
//
//        for (int iNum : num) {
//
//            if (iNum%2==0) {
//                evNumbers=iNum+1;
//
//            System.out.println();
//        }else{
//              oddNumbers=evNumbers-1;
//            }
//        }
//        System.out.println(""+evNumbers);
//        System.out.println(""+oddNumbers);

        /*Task2
         * Create integer array {32, 17, 58, 42, 5}
         * Using Enhanced For Loop search specific number inside the array
         * If array contains that number return true, otherwise return false
         * Example: number = 12
         * Output: false
         * */

//        int[]numbers={32,17,58,42,5};
//        int n=17;
//        boolean isContains=false;
//
//        for (int number : numbers) {
//            if (number==n){
//                isContains=true;
//            }
//
//        }
//        System.out.println(isContains);

        /*Task4
         * Given an array of integers {6, 9, 1, 0, 8};
         * return true if 6 appears as either the first or last element in the array.
         * */

        int[] numB = {6, 9, 1, 0, 8};
        boolean firstElement = false;

        for (int i = 0; i < numB.length; i++) {

            if (numB[i] == numB[0]) {
                firstElement = true;
            }

        }
        System.out.println("firstElement = " + firstElement);
    }
}
