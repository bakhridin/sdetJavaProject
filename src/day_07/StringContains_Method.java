package day_07;

public class StringContains_Method {
    public static void main(String[] args) {

        String usa="united states of america";

        boolean usaContainsString = usa.contains(" states ");
        System.out.println("states = " + usaContainsString);


        String str="java is fun";

        boolean is = str.contains("is ");
        System.out.println("is = " + is);

        System.out.println(str.contains(" java"));

    }
}
