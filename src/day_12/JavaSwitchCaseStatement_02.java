package day_12;

import java.util.Scanner;

public class JavaSwitchCaseStatement_02 {
    public static void main(String[] args) {

        /**
         * The Java switch statement executes
         * one statement from multiple
         * conditions. It is like if-else-if
         * ladder statement. The switch
         * statement works with byte, short,
         * int, long, enum types, String.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int number = scan.nextInt();

        String str = scan.nextLine();

        String result="";

        switch (number) {
            case 1:
                result="Number1";
                break;

            case 2:
                result="Number 2";
                break;

            default:
                result="Enter any number";
                break;

        }
        System.out.println("result = " + result);

    }
}
