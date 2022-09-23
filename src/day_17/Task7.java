package day_17;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
    Homework
    String num1 = "368"
    String num2 = "1020304050"

    10 20 30 40 50 60
     3  3  3  3  3  3 = 12345
     6  6  6  6  6  6 = 42042
     8  8  8  8  8  8 = 24602
    */

        String num1 = "368";
        String num2 = "102030405060";


      //  System.out.println(""+10%6+"");

//        for (int k = 0; k < num1.length(); k++) {
//            char ch1 = num1.charAt(k);
//            String s1 = String.valueOf(ch1);
//            int numStr1 = Integer.parseInt(s1);
//
//            for (int i =0, j=1 ; i < num2.length(); i+=2, j+=2) {
//                char ch2 = num2.charAt(i);
//                char ch3 = num2.charAt(j);
//                String s2 = String.valueOf(ch2)+String.valueOf(ch3);
//                int numStr2 = Integer.parseInt(s2);
//                System.out.print(""+numStr2%numStr1+" ");
//            }
//            System.out.println();
//        }

//        for (int k = 0; k < num1.length(); k++) {
//            char ch1 = num1.charAt(k);
//            String s1 = String.valueOf(ch1);
//            int numStr1 = Integer.parseInt(s1);
//        //    System.out.println(numStr1);
//
//            for (int i =0, j=1 ; i < num2.length(); i+=2, j+=2) {
//                char ch2 = num2.charAt(i);
//               char ch3 = num2.charAt(j);
//                String s2 = String.valueOf(ch2)+String.valueOf(ch3);
//                int numStr2 = Integer.parseInt(s2);
//                System.out.print(""+numStr2%numStr1+" ");
//            }
//            System.out.println();
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter yor first number = ");
//        String str1 = scan.nextLine();
//        System.out.println("Enter yor second number = ");
//        String str2 = scan.nextLine();
//
//        for(int i=0;i<str1.length();i++){
//            int num_1 = Integer.parseInt(str1.substring(i,i+1));
//            System.out.println("");
//            for(int j=0;j<str2.length();j+=2){
//                int num_2 = Integer.parseInt(str2.substring(j,j+2));
//                System.out.print(num_2%num_1);
//            }
//
//        }

            int[] num3={3,6,8};
            int[]num4={10,20,30,40,50};
            int num5=0;
            int num6=0;

        for (int i = 0; i < num3.length; i++) {
            num5=num3[i];
            System.out.println();
            for (int i1 = 0; i1 < num4.length; i1++) {
                num6=num4[i1];

                System.out.print(""+num6%num5);

            }


        }

    }
}
