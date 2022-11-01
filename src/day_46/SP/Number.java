package day_46.SP;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Number {


     static boolean checkEvenNumber(int x) {
         if (x%2==0) {
             return true;
         }
        return false;
    }

    static ArrayList<Integer> evenNumbers(int x) {
         ArrayList<Integer>list =new ArrayList<>();
        for (int i = 1; i <=x; i++) {
            if (i%2==0) {
                list.add(i);
            }

        }
        return list;
    }






    @Test
    public void checkEvenNumbers() {
        int x=10;
    int len=Number.evenNumbers(x).size();
       // Assert.assertTrue(Number.checkEvenNumber(x));
        Assert.assertEquals(len,Number.evenNumbers(x).size());
    }
}
