package day_49;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        String date = "2014-06-12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate parse = LocalDate.parse(date, formatter);
        System.out.println("parse = " + parse);

        LocalDateTime localDateTime=LocalDateTime.parse("2014-11-05T14:15:10",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("localDateTime = " + localDateTime);




    }
}
