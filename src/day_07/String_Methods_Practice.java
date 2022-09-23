package day_07;

public class String_Methods_Practice {
    public static void main(String[] args) {
       //1. concat()-method:Appends a string to the end of another string. Returns= String
        concatMethod("Bakhridin ","Khodzhaev");

       //2. length()-method:Returns length of a specified string. Returns int
        lengthMethod("Bakhridin Khodzhaev");


    }

    public static void concatMethod(String firstName,String lastName) {

        String fullName=firstName.concat(lastName);
        System.out.println("fullName = " + fullName);

    }

    public static void lengthMethod(String str) {
        int length = str.length();
        System.out.println("length = " + length);

    }






}
