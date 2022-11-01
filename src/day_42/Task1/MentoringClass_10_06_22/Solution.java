package day_42.Task1.MentoringClass_10_06_22;

public class Solution {
//    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//    Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//    The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//    Your solution must use only constant extra space.

    public static int[] twoSum(int[]numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target) {
                    target=numbers[i];
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[]arr={2,3,7,5,8};
        System.out.println(twoSum(arr,9));

    }

    public static void printName(String str){
        str= str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

}
