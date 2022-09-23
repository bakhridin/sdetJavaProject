package day_12;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number=> ");

        int num = scan.nextInt();
        char num1= (char) num;

        String month="";

        switch (num1) {
            case '1':
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;

            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;

            case 10:
                month="October";
                break;

            case 11:
                month="November";
                break;

            case 12:
                month="December";
                break;

            default:
                month="Invalid";
                break;

        }

        System.out.println("month = " + month);


    }
}
