package day_08;

public class StringStartsWithAndEndsWith_Method {
    public static void main(String[] args) {
        // startsWith() Checks whether a string starts with specified characters boolean
        // endsWith() Checks whether a string ends with the specified character(s) boolean


        String str="Exelenter";

        boolean e = str.startsWith("E"); // returns true, since str stars with character "E"
        System.out.println("e = " + e);

        boolean exel = str.startsWith("Exel");
        System.out.println("exel = " + exel);

        String str1="java is fun";

        boolean is = str1.startsWith("is", 5); // you may use if needed, but better to use method contains();
        System.out.println("is = " + is);

        boolean n = str1.endsWith("n");
        System.out.println("n = " + n);

        boolean n1 = str1.endsWith("N");
        System.out.println("n1 = " + n1);


        String str2="hello world";

        boolean isTure = str2.startsWith("Hello");
        System.out.println("isTure = " + isTure);

        boolean isEndWithld = str2.endsWith("ld");
        System.out.println("isEndWithld = " + isEndWithld);


    }
}
