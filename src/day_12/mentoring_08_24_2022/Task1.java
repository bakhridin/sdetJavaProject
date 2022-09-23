package day_12.mentoring_08_24_2022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first num:");
        int firstNum = scan.nextInt();
        System.out.print("Enter second num:");
        int secondNum = scan.nextInt();
        System.out.print("Enter third num:");
        int thirdNum = scan.nextInt();
        String result="";

        if (firstNum>secondNum && firstNum>thirdNum) {
               result="first number is bigger";
        } else if (secondNum<firstNum&& secondNum<thirdNum) {
            result="second number is bigger";
        } else if (thirdNum<firstNum && thirdNum<secondNum) {
            result="second number is bigger";
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("result = " + result);
    }
}
