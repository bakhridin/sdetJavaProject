package SatudayProject_09_03_2022;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*
    Task1:
         1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.

        2. Using Random class, generate random numbers between 0 and 10
        and fill all indexes with both arrays.

        3. Sort both of arrays.

        4. Print true if all the numbers in the inner array also appear in the outer array.
        Otherwise, print false
        (In other words, print true if first array contains second array.)
        Samples:
        [1, 2, 4, 6], [2, 4] → true
        [1, 2, 4, 6], [2, 3] → false
        [1, 2, 4, 4], [2, 4] → true
     */

    public static void main(String[] args) {

        Random rnd=new Random();

        int arrOuter[] = new int[4];
        int[] arrInner = new int[2];
        int counter=0;
        boolean contains=false;

        for (int i = 0; i < arrOuter.length; i++) {

            arrOuter[i]= rnd.nextInt(4+1);
          //  System.out.println();

            for (int i1 = 0; i1 < arrInner.length; i1++) {
                arrInner[i1]= rnd.nextInt(3);
               counter=arrInner[0];

                if (arrOuter[i]==arrInner[i1]) {
                    contains=true;
                }


            }
        }


        System.out.println(""+ Arrays.toString(arrOuter));
        System.out.println(""+ Arrays.toString(arrInner));
        System.out.println("contains = " + contains);









    }

}
