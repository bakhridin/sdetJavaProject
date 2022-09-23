package SaturdayProject_09_10_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        int input1, input2 = 0;
        Scanner scan = new Scanner(System.in);

        input1 = scan.nextInt();
        input2 = scan.nextInt();

        System.out.println("gause sum of squares: " + sumOfSquaresOfGaussSums(input1,input2));
    }

    static int gaussSumOf(int a)
    {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }

        return sum;
    }

    static int sumOfSquaresOfGaussSums(int a, int b){
        int num1 = gaussSumOf(a);
        int num2 = gaussSumOf(b);
        return num1*num1 + num2*num2;
    }


}