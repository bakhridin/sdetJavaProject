package day_45.Saturday_Project_10_08_2022.mentoringClass_10_11_22;

public class Task21 {
    //Given an integer, write a function to determine if it a power of 2.
    public static void main(String[] args) {
        int num =16;
        boolean b = powerOf2(num);
        System.out.println(b);


    }

    static boolean powerOf2(int x) {

        int i=1;
        while (i<x) {
            i*=2;
        }
        if (i==x) {
            return true;
        }
        return false;

    }
}
