package day_23;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Task1 ts = new Task1();

        int[] a = {11, 22, 33, 44, 55};
        int maximum = ts.getMaximum(a);
        System.out.println("maximum = " + maximum);

        int minimum = ts.getMinimum(a);
        System.out.println("minimum = " + minimum);

        int total = ts.getTotal(ts.getMaximum(a), ts.getMinimum(a) );
        System.out.println("total = " + total);

    }

    int getMaximum(int[] a) {

        int max = a[a.length - 1];
        return max;

    }

    int getMinimum(int[] a) {

        int min = a[0];
        return min;

    }

    int getTotal(int a, int b) {

        int total = a + b;
        return total;
    }
}
