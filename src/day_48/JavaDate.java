package day_48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class JavaDate {
    public static void main(String[] args) {
        String customer = null;
        LocalDate today=LocalDate.now();
        System.out.println(today);

        String format = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("format = " + format);
        String format1 = today.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        System.out.println("format1 = " + format1);

//        DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        System.out.println("formatter = " + formatter);


    }
}
