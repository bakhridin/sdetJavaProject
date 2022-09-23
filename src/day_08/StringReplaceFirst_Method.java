package day_08;

public class StringReplaceFirst_Method {
    public static void main(String[] args) {


        String str1 ="java is fun. I LOVE JAVA";

        String s = str1.replaceAll("[A-Z]", "*");
        System.out.println("s = " + s);

        String s1 = str1.replaceFirst("[A-Z]", "*");
        System.out.println("s1 = " + s1);

        String s2 = str1.replaceAll("[A-z]", "*");
        System.out.println("s2 = " + s2);

        String s3 = str1.replaceFirst("[A-z]", "*REPLACEALL*");
        System.out.println("s3 = " + s3);

    }
}
