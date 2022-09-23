package day_10;

import java.util.Scanner;

public class JavaIfStatementsPractice_03 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Print string1 => ");
        String s1 = scan.nextLine();

        System.out.println("Print string1 => ");
        String s2 = scan.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Two strings are equal");
        }
        if (!s1.equalsIgnoreCase(s2)) {

            System.out.println("Two strings are not equal");
        }


    }
}
