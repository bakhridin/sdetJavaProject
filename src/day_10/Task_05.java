package day_10;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("Please enter string =>");
        String s = scan.nextLine();
        System.out.print("Please enter integer =>");
        int i = scan.nextInt();

        if (i<=s.length()) {
            String substring = s.substring(0,i);
            System.out.println("substring = " + substring);
        }

        if (i>s.length()) {
            String substring1 = s.substring(s.length() - 3);
            System.out.println("substring1 = " + substring1);

        }






    }
}
