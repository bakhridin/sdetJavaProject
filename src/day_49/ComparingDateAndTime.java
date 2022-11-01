package day_49;

import java.time.LocalDate;

public class ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDate minus = now.minusDays(5);
        System.out.println("minus = " + minus);

        boolean after = now.isAfter(minus);
        System.out.println("after = " + after);

        boolean before = now.isBefore(minus);
        System.out.println("before = " + before);

        boolean leapYear = now.isLeapYear();
        System.out.println("leapYear = " + leapYear);

    }


}
