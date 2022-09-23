package day_31._09_21_22022_Mentoring;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
         */
        Integer[] nums={1,2,3,1};
        boolean b = containsDuplicate(nums);
        System.out.println("b = " + b);

        int []num={1,2,3,4};
        boolean isduplicate = isduplicate(num);
        System.out.println("isduplicate = " + isduplicate);


    }
    public static boolean containsDuplicate(Integer[] nums) {
        HashSet<Integer> set=new HashSet<>(Arrays.asList(nums));
        for (Integer integer : set) {
            if (integer==integer) {
                return true;
            }

        }

        return false;
    }

    static  boolean isduplicate(int[] arr) {
        HashSet set1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }
        if (set1.size() == arr.length) {
            return true;
        }
        return false;
    }
}
