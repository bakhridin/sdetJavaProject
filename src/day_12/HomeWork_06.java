package day_12;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {

        /**
     you may not use the scanner.

     using switch statement
     have below outputs:
     # - HASHTAG
     $ - DOLLAR
     % - PERCENT
     & - AND
     ELSE - WRONG INPUT
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your input: ");

        String ss = scan.nextLine();
        String result = "Wrong Input";

        if (ss.length()==1) {
            char c = ss.charAt(0);

            switch (c) {
                case '#':
                    result = "HASHTAG";
                    break;
                case '$':
                    result = "DOLLAR";
                    break;
                case '%':
                    result = "PERSENT";
                    break;
                case '&':
                    result = "AND";
                    break;
            }
        }
        System.out.println("result = " + result);




//  //       int i=scan.nextInt();  //#=35, $=36, %=37, &=38
//        switch (i) {
//            case 35:
//                char ch= (char) i;
//                System.out.println(ch+" = HASHTAG");
//                break;
//
//            case 36:
//                char ch1= (char) i;
//                System.out.println(ch1+" = DOLLAR");
//                break;
//
//            case 37:
//                char ch2=(char)i;
//                System.out.println(ch2+" = PERCENT");
//                 break;
//            case 38:
//                char ch3=(char)i;
//                System.out.println(ch3+" = AND");
//                 break;
//            default:
//                System.out.println("Wrong input");
//                break;
//
//        }

    }
}
