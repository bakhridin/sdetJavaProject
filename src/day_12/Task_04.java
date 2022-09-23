package day_12;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade=> ");
        String str=scan.nextLine();
        String str2="";

        switch (str) {
            case "A":
                str2="Excellent!!!";
                break;
            case "B":
                str2="Well done";
                break;

            case "C":
                str2="Good";
                break;

            case "D":
                str2="Need improvement";
                break;
            case "F":
                str2="Fail";
                break;

            default:
                str2="Wrong input";
                break;
        }
        System.out.println("Your result is  = " + str2);

    }
}
