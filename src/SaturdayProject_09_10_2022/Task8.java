package SaturdayProject_09_10_2022;

import java.util.Arrays;

public class Task8 {


    public static void main(String[] args) {
        int[] arr = {1,6,12,15,22,18,30,16};
        int low = 12;
        int up = 20;
        System.out.println(Arrays.toString(updateRange(arr,low,up)));
    }
    static int[] updateRange (int[] arr, int low, int up){
        int []newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (low>up){
                System.out.println("Upper bound is always given as bigger than or equal to lower bound!!!");
                break;
            }
            if (arr[i] <= low || up <= arr[i]) {
                newArr[i] = arr[i];
            } else if (arr[i] > low && up > arr[i]) {
                newArr[i] = -1;
            }
        }
        return newArr;
    }
}
