package day_20;

import java.util.Arrays;

public class JavaArraysClass {
    public static void main(String[] args) {

        int[] numArr = new int[5];
        String s = Arrays.toString(numArr);
        System.out.println("s = " + s);

        for (int i = 0; i < numArr.length; i++) {
            numArr[i]=10;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
