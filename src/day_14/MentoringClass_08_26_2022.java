package day_14;

import java.util.Random;

public class MentoringClass_08_26_2022 {
    public static void main(String[] args) {

        /**
         * Task1:
         *
         * Generate two int numbers. return true if either one is 6. Or if their sum or difference is 6.
         */


        Random random = new Random();


       /*
    Task2:
    Generate number between 0 and 100, check if number is odd or even and return output.
     */
//        String result = "";
//        int rnd11 = random.nextInt(100);
//
//        if (rnd11 % 2 == 0) {
//            result = "true";
//
//        } else {
//            result = "false";
//        }
//        System.out.println("result = " + result);

//        Generate two numbers between 1 and 100 included.
//        if both of the numbers are at least 50, return "Good"
//        and if one of the numbers is at least double the amount of the other one, return "Great".
//        if one of the numbers is less then 50, return "Bad"


//
//        int i1 = random.nextInt((100 - 1+1)+1);
//        int i2 = random.nextInt((100 - 1+1)+1);
//
//
//        System.out.println("i1= "+i1+";"+"i2= "+i2);
//        String result="";


//         result1=(i1==50 && i2==50)? "Good"
//                ?(i1=(i2*2))"Great"
//                ?(i1<50 && i2<50)"Good": "Bad";


        /**
         * Task4:
         *
         *     Generate two numbers btw 0 and 3 and get the total. Generate third number btw 3 and 6.
         *     if total of two numbers equals to third number, return SUCCESS, else, return TRY AGAIN LATER
         */


        int i3 = random.nextInt(3);
        int i4= random.nextInt(6 -2)+2;
        int i5=0;

        System.out.println("i3="+i3+" i4 "+i4);

        String result=(i5==i3+i4)? "SUCCESS":"TRY AGAIN LATER";
        System.out.println("result = " + result);





    }

}

