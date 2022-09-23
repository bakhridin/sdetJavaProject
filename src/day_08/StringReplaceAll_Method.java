package day_08;

public class StringReplaceAll_Method {
    public static void main(String[] args) {

        String str="Java is Fun. I love java";

        String x = str.replaceAll("[aeJF]", "x");
        System.out.println("x = " + x);

        String price="$2.5 usd";

        String s = price.replaceAll("[$usd]", " ");
        System.out.println("s = " + s);

        String s1 = price.replaceAll("[^0-9.]", "");
        System.out.println("s1 = " + s1);

        String s2 = str.replaceAll("[A-Z]", "S");
        System.out.println("s2 = " + s2);

        String s3 = str.replaceAll("[a-z]", "5");
        System.out.println("s2 = " + s3);

        String s4 = str.replaceAll("[A-Za-z]", "8");
        System.out.println("s2 = " + s4);


        String address ="1966 North Hartfor Street 1109, Chandler AZ 85222";
        String s5 = address.replaceAll("[^0-9 ,]", "*");
        System.out.println("s5 = " + s5);


    }
}
