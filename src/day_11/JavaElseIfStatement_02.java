package day_11;

import java.util.Scanner;

public class JavaElseIfStatement_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.print("Please enter integer==> ");
//        int daY = scan.nextInt();


//        if (daY == 1) {
//            System.out.println("Monday");
//        } else if (daY == 2) {
//            System.out.println("Tuesday");
//        } else if (daY == 3) {
//            System.out.println("Thursday");
//        } else if (daY == 4) {
//            System.out.println("Friday");
//        } else if (daY == 5) {
//            System.out.println("Saturday");
//        } else if (daY == 6) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("This is not a valid day");
//
//        }

        /**Task4
         * Given a int number
         *             -print "fizz" when given number is divisible by 5
         *             -print "buzz" when given number is divisible by 3
         *             -print "fizzbuzz" when given number is divisible by both 3 and 5
         *             -print same number if it is not divisible by 3 or 5
         *         Examples:
         *             input1 -> 10 | output1 -> fizz
         *             input2 -> 9  | output2 -> buzz
         *             input3 -> 30 | output3 -> fizzbuzz
         *             input4 -> 7  | output4 -> 7
         */

        System.out.print("Please enter number=> ");
        int num = scan.nextInt();

        String output="";

        if (num%5==0 && num%3==0) {
            output="fizzbuzz";
        }
         else if (num%3==0) {
            output = "fizz";

        }
        else if (num%5==0 ) {
            output = "buzz";
        }
        else {
            output = String.valueOf(num);
        }
        System.out.println("output = " + output);



    }
}