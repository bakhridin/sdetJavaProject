package day_12;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade=> ");
        String str=scan.nextLine();
        String str2="";

        switch (str) {
            case "Monday":
                str2="1";
                break;
            case "Tuesday":
                str2="2";
                break;

            case "Wednesday":
                str2="3";
                break;

            case "Thursday":
                str2="4";
                break;
            case "Friday":
                str2="5";
                break;

            case "Saturday":
                str2="6";
                break;

            case "Sunday":
                str2="7";
                break;

            default:
                str2="Wrong input";
                break;
        }
        System.out.println("Your result is  = " + str2);

    }
}
