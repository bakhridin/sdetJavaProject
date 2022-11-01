package day_44;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaUnitTest {

    @Test
    public void testTotal() {
        int numberOne = 10;
        int numberTwo = 20;
        int total = numberOne + numberTwo;
        Assert.assertEquals(total, 30, "Total is not correct");
    }

    @Test
    public void stringIsEmpty() {
        String str = "";

        Assert.assertTrue(str.isEmpty(), "String is not empty");
    }

    @Test
    public void stringIsNotEmpty() {
        String str = "assertFalse";


        Assert.assertFalse(str.isEmpty(), "String is not empty");
    }

    @Test
    public void arraysAreEqual() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        Assert.assertEquals(arr1, arr2, "arrays are not equal");
    }

    @Test
    public void equalsNoOrder() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(list1,list2);
    }


}
