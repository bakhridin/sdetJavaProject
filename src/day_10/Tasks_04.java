package day_10;

import java.util.Scanner;

public class Tasks_04 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        /*
    Create a scanner
    enter two strings
    if the length of the strings are equal, print "The lengths are equal"
    if the length of the string are not equal, print "The lengths are not equal"
     */
        System.out.println("Enter first string");
        String str1=scan.nextLine();
        System.out.println("Enter first string");
        String str2=scan.nextLine();



        if (str1.length()==str2.length()) {
            System.out.println("The lengths are equal");
        }
        if ((str1.length()!=str2.length())) {
            System.out.println("The lengths are not equal");
        }

    }
}
