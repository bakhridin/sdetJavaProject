package SaturdayProject_08_20_22;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        /**Task10
         * Given a String. If a given string contains only digits, return true. Else, return false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string==> ");
        String s = scan.nextLine();

        String s1 = s.replaceAll("[^\\d]", "");

        if (s.equals(s1)) {
            System.out.println(true);
        }
        if (!s.equals(s1)) {
            System.out.println(false);
        }


//        if (s.contains("0123456789")) {
//            System.out.println("True");
//        }
//        if (!s.contains("0123456789")) {
//            System.out.println("False");
//        }



    }
}
