package day_06.JavaString;

public class StringConcat {
    public static void main(String[] args) {
        String str1="Hello ";
        String str2="Hello";
        String str3=str1+str2;

        System.out.println("str3 = " + str3);

        String str4=str1.concat(str2);
        System.out.println("str4 = " + str4);

        //
        String ex="Exelenter ";
        String sd="Sdet";
        String sm=ex.concat(sd);
        System.out.println("sm = " + sm);

        String U="United ";
        String St="State ";
        String of="of ";
        String Am="America";

        System.out.println(U.concat(St+of+Am));







    }
}
