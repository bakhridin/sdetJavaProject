package day_06.JavaString;

public class StringLength {
    public static void main(String[] args) {
        String country ="United State of America";
        int length = country.length();
        System.out.println("length = " + length);
        // System.out.println(country.length());

        String ocean ="Pacific";
        int length1 = ocean.length();
        System.out.println("length1 = " + length1);

        String myName ="Bakhridin Khodzhaev";
        int length2 = myName.length();
        System.out.println("length2 = " + length2);

        String city ="Chandler";
        int length3 = city.length();
        System.out.println("length3 = " + length3);

        stringConcat_and_GetLength("Hello ","all ","students");

    }

    public static void stringConcat_and_GetLength(String str1,String str2,String str3) {

        String str4=str1.concat(str2).concat(str3);
        System.out.println(str4);
        System.out.println("Length of given parameters are "+str4.length());

    }
}
