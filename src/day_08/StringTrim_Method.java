package day_08;

public class StringTrim_Method {
    public static void main(String[] args) {

        String str="       Java is Fun       ";
        int length = str.length();
        System.out.println("length = " + length);

        String trim = str.trim();
        System.out.println("trim = " + trim);

        int length1 = trim.length();
        System.out.println("length1 = " + length1);



    }
}
