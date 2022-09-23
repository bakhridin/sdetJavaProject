package day_24;

import java.util.Arrays;

public class JavaMethodsInMethods {

    int getMax(int... nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];

    }
}
