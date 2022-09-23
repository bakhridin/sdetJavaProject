package day_07;

import java.util.Locale;

public class StringIndexOf_Method {

    public static void main(String[] args) {

        //       String company ="EXELENTER";
//
//        int e = company.indexOf("E");
//        System.out.println("e = " + e);
//
//        int n = company.indexOf("N");
//        System.out.println("n = " + n);
//
//        int x = company.indexOf("X");
//        System.out.println("x = " + x);
//
//        int r = company.indexOf("R");
//        System.out.println("r = " + r);
//
//        System.out.println(company.length()-1);
//
//        int i = company.indexOf("O");
//        System.out.println("i = " + i); //When method doesn't find a character or string, return value will be -1
//
//
//        int len = company.indexOf("LEN");
//        System.out.println("len = " + len);
//
//        int e1 = company.indexOf("E", 5);
//        System.out.println("e1 = " + e1);
//
//
//        //Task 1
//
//        String us ="united states of america";
//
//        int s = us.indexOf("s");
//        System.out.println("s = " + s);
//
//        int s1 = us.indexOf("s", 8);
//        System.out.println("s1 = " + s1);
//
//        System.out.println(us.indexOf("america"));

        String firstName = "bakhridin";
        String lastName = "khodzhaev";
        String fullName = firstName.concat(lastName);

//        int b = fullName.indexOf("b");
//        System.out.println("b = " + b);
//
//        int d = fullName.indexOf("d");
//        System.out.println("d = " + d);
//
//        int d1 = fullName.indexOf("d",8);
//        System.out.println("d1 = " + d1);
//
//        int d2 = fullName.indexOf('d');
//        System.out.println("d2 = " + d2);
//
//        int d3 = fullName.indexOf('d', 7);
//        System.out.println("d3 = " + d3);

        char c = fullName.charAt(10);
        System.out.println("c = " + c);

        char c1 = fullName.charAt(fullName.length() - 1);
        System.out.println("c1 = " + c1);

        String substring = fullName.substring(0, 9);
        System.out.println("substring = " + substring);
        String substring1 = fullName.substring(9);
        System.out.println("substring1 = " + substring1);

        boolean empty = fullName.isEmpty();
        System.out.println("empty = " + empty);

        boolean din = fullName.contains("din");
        System.out.println("din = " + din);

        String fullName1 = "BakhridinKhodzhaev";

        boolean equals = fullName.equals(fullName1);
        System.out.println("equals = " + equals);

        boolean b = fullName.equalsIgnoreCase(fullName1);
        System.out.println("b = " + b);

        boolean b1 = fullName1.startsWith("b");
        System.out.println("b1 = " + b1);

        boolean b2 = fullName1.startsWith("B");
        System.out.println("b2 = " + b2);

        boolean b3 = fullName1.toLowerCase().startsWith("b");
        System.out.println("b3 = " + b3);

        String s = fullName1.toLowerCase();
        System.out.println("s = " + s);

        String trim = fullName1.trim();
        System.out.println("trim = " + trim);

        String replace = fullName.replace("d", "D");
        System.out.println("replace = " + replace);


    }


}
