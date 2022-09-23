package day_20;

import java.util.Arrays;

public class JavaArraysClassBinary5 {
    public static void main(String[] args) {

        int[] arr={1,3,5,7,9};
        int i = Arrays.binarySearch(arr, 9);
        System.out.println("i = " + i);
    }
}
