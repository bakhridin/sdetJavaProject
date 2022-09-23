package SaturdayProject_08_27_2022;

import java.util.Random;

public class Task_10 {

    /**
     * Task 10.
     * Generate two numbers.
     * number1 should be between 1 and 12, which represents a month
     * number2 should be between 1900 and 2022.
     * Create a date, in following format ==> November, 1980
     */

    public static void main(String[] args) {

        Random random = new Random();

        int month = random.nextInt(1, 12+1);
        int year = random.nextInt(1900, 2022);

        String output = "";

        output=month==1 ? "January, "+year :
                month==2 ?"February, "+year :
                month==3 ?"March, "+year :
                month==4 ?"April, "+year :
                month==5 ?"May, "+year :
                month==6 ?"June, "+year :
                month==7 ?"July, "+year :
                month==8 ?"August, "+year :
                month==9 ?"September, "+year :
                month==10 ?"October, "+year :
                month==11 ?"November, "+year : "December, "+year ;

        System.out.println("output = " + output);

    }
}
