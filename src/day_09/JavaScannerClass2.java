package day_09;

import java.util.Scanner;

public class JavaScannerClass2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);



        System.out.print("Please enter integer number  ");
        int i = scan.nextInt();

        System.out.print("Please enter double number  ");
        double v = scan.nextDouble();
        System.out.print("Please enter boolean  ");
        boolean b = scan.nextBoolean();

        System.out.println("integer is = " + i);
        System.out.println("double is  = " + v);
        System.out.println("boolean is = " + b);




    }
}
