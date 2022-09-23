package day_10;

import java.util.Scanner;

public class AndOrOperators_06 {
    public static void main(String[] args) {
        // And and Or operators

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter number 1=> ");
        int i1 = scan.nextInt();
        System.out.println("Enter number 2=> ");
        int i2 = scan.nextInt();

        System.out.println("Enter number 13=> ");
        int i3 = scan.nextInt();

        if (i1==i2 && i2==i3) {
            System.out.println("All numbers are equal and sum of the numbers are="+(i1+i2+i3));
        }
        if (i1==i2 || i1==i3 || i2==i3) {
            System.out.println("Return product of the numbers=");
        }

        if (i1==i2 || i1==i3 || i2<0) {
            System.out.println("Return 0");
        }

    }
}
