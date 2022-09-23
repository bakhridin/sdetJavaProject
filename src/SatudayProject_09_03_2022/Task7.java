package SatudayProject_09_03_2022;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    /*
    Task7:
        1. Create an array with random length between 5 and 15.
        2. Generate random numbers between 0 and 3 and insert into an array.
        3. Print true if the first element and the last element are equal.
            Print false otherwise
            Example:
            [1, 2, 3] → false
            [1, 2, 3, 1] → true
            [1, 2, 1] → true
            [1] → true
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        int num = rnd.nextInt(5,8);

         int[] arrN=new int[num];
       System.out.println(Arrays.toString(arrN));

       boolean result=false;

        for (int i = 0; i < arrN.length; i++) {
            arrN[i]= rnd.nextInt(arrN.length);
            if (arrN[0]==arrN[arrN.length-1]) {
                result=true;
            }

        }
        System.out.println(Arrays.toString(arrN));
        System.out.println("result = " + result);

    }
}
