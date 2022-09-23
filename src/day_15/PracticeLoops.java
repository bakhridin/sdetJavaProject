package day_15;

import java.util.Scanner;

public class PracticeLoops {

    public static void main(String[] args) {

        String str1 = "My Java is not good, I need to improve it as soon as possible";

        int num1 = 0;
        int count = 0;

//        while (num1 < str1.length()) {
//            if (str1.charAt(num1) == 'o') {
//                count++;
//            }
//            num1++;
//
//        }
//        System.out.println(count);

//        do {
//            if (str1.charAt(num1) == 'a') {
//                count++;
//            }
//            num1++;
//
//        } while (num1 < str1.length());
//        System.out.println(count);

        Scanner scan = new Scanner(System.in);

        String input = "";

//        while (!input.equalsIgnoreCase("Java")) {
//            System.out.print("Keep asking as long user enters \"Java\"=>");
//            input = scan.nextLine();
//        }
//        System.out.println("User entered correct input");

        int number=0;
        String name ="Modari jononi man";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='m') {
                number++;
            }
        }
        System.out.println(number);


//        for (int i = name.length(); i >0; i--) {
//
//            System.out.println("Iterate 4 times");
//
//        }



    }

}
