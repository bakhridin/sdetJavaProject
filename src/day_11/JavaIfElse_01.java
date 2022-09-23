package day_11;

import java.util.Scanner;

public class JavaIfElse_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter number=> ");
//        int i = scan.nextInt();
//
//        if (i == 1) {
//            System.out.println("i = " + i);
//        } else {
//            System.out.println("Wrong number");
//        }

        System.out.print("Enter your string==>");
        String s = scan.nextLine();

        if (s.startsWith("Java")) {
            System.out.println("I love Java");
        } else {
            System.out.println("Wrong input");
        }
    }
}
