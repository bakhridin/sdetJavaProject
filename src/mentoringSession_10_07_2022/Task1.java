package mentoringSession_10_07_2022;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 7};
        int[] sumOfTwo = sumOfTwo(arr, 9);
        System.out.println(Arrays.toString(sumOfTwo));

    }

    static int[] sumOfTwo(int[] arr, int target) {
        int[] newArr = new int[2];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] + arr[j] == target && (i != j)) {
                    newArr[0] = j + 1;
                    newArr[1] = i + 1;
                    break;
                }

            }

        }

        return newArr;

    }
}
