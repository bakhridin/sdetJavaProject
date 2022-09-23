package day_09;

import java.util.Scanner;

public class JavaScannerClass1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Please enter your name");
//        String s = scan.nextLine();
//        System.out.println("Your name is = " + s);
//
//        System.out.println("Please enter your address ");
//        String s1 = scan.nextLine();
//        System.out.println("Please enter your zipcode");
//        String s2 = scan.nextLine();
//
//        System.out.println("Please enter your city");
//        String s3 = scan.nextLine();
//
//        System.out.println("Your name is "+s+"\nYour address is"+s1+s2+s3);

        System.out.println("Please enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Your favorite move");
        String movieName = scan.nextLine();

        System.out.println("Your favorite book");
        String bookName = scan.nextLine();

        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("My favorite movie is " + movieName + " and my favorite book is " + bookName);




    }
}
