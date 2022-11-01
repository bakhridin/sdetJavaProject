package day_50;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter number 1");
        int number1=0;
        System.out.println("Please enter number 2");
        int number2 = Integer.parseInt(scan.nextLine());
        System.out.println("Your total is  "+ (number1+number2));

        try {
             number1 = Integer.parseInt(scan.nextLine());
        } catch (Exception e ) {
            System.out.println("Provide numeric format only");
        }
    }
}
