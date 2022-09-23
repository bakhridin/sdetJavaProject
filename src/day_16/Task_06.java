package day_16;

import java.util.Locale;

public class Task_06 {
    public static void main(String[] args) {

        String str = "Java is Fun";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'F') {
                continue;//break;

            }
            System.out.print(str.charAt(i));

        }

    }
}
