package day_13;

import java.util.Scanner;

public class JavaTernaryOperator_02 {
    public static void main(String[] args) {

        // CONDITION ? OUTPUT IF TRUE : OUTPUT IF FALSE

        Scanner scan = new Scanner(System.in);

        /**
         * using scanner get int between 0-24
         * if time is between 7-20 print Good Day, else print Good night
         */

        System.out.print("Enter first num=> ");
        int num1 = scan.nextInt();
//        System.out.print("Enter second num=> ");
//        int num2 = scan.nextInt();
        String result="";

//        result=num1>=7 && num1<=20 ? "Good Day" : "Good night";
//        System.out.println("result = " + result);

        result=(7<=num1 && num1<=20) ?(num1>=7 && num1<=12) ? "Good Morning" :  "Good Day"
                : (num1>=20 && num1<=22)?"Good Evening":"Good night";
        System.out.println("result = " + result);






    }
}
