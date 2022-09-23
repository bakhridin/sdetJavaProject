package day_07;

public class StringCharAt_Method {
    public static void main(String[] args) {

        String company="EXELENTER";

        char c = company.charAt(0);
        System.out.println("c = " + c);

        String us="united states of america";

        char c1 = us.charAt(5);
        System.out.println("c1 = " + c1);

        char c2 = us.charAt(us.lastIndexOf("a"));
        System.out.println("c2 = " + c2);

        char c3 = us.charAt(us.indexOf("u"));
        System.out.println("c3 = " + c3);


    }
}
