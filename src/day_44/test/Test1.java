package day_44.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    @Test
    public void totalIsEquals() {
        int num=10;
        int expected=(num*(num+1))/2;
        int actual =JavaMath.getTotal(num);
        Assert.assertEquals(actual,expected,"");

    }

    @Test
    public void totalIsNotEquals() {
        int num=10;
        int expected=0;
        int actual =JavaMath.getTotal(num);
        Assert.assertNotEquals(actual,expected,"false");

    }

    @Test
    public void totalIsTrue() {

        int expected=10;
        int actual =10;
        Assert.assertTrue(actual==expected,"Total is not equal");

    }

    @Test
    public void positiveScen() {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Anthony","Debora","Willy"));
        String str=JavaMath.getString(list,"A");
        Assert.assertNotNull(str,"correct");

    }


}
