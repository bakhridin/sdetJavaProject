package day_12;

import java.util.Scanner;

public class JavaSwitchCaseStatement_01 {
    public static void main(String[] args) {

        /**
         * The Java switch statement executes
         * one statement from multiple
         * conditions. It is like if-else-if
         * ladder statement. The switch
         * statement works with
         * byte, short,
         * int, enum types, String.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int number = scan.nextInt();
        String result="";

        switch (number) {
            case 1:
                result="Monday";
                break;

            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;

            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;

            default:
                result="Invalid day";
                break;
        }
        System.out.println("result = " + result);

    }
}
