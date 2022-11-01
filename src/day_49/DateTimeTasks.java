package day_49;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeTasks {

    @Test
    public void testDate1() {
        LocalDate now = LocalDate.now();
        now = now.plusYears(10);
        now = now.plusMonths(5);
        System.out.println("now = " + now);
        LocalDate date = LocalDate.now().plusYears(10).plusMonths(5);
        Assert.assertEquals(date, now);
    }

    @Test
    public void checkAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1976, 04, 19);
        System.out.println("birthDate = " + birthDate);
        int i = now.compareTo(birthDate);
        System.out.println("i = " + i);

    }




    public static void main(String[] args) {


            LocalTime timeNow = LocalTime.now();
            System.out.println("timeNow = " + timeNow);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any time");
            timeNow = LocalTime.parse(scan.nextLine());
            System.out.println("timeNow = " + timeNow);

    }


}

