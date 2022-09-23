package day_09;

public class StringToPrimitive_02 {
    public static void main(String[] args) {

        String s1="10";
        String s2="20";

        System.out.println("sum = "+s1+s2);

        int i = Integer.parseInt(s1);
        System.out.println("i = " + i);
        Integer integer = Integer.valueOf(s1);
        System.out.println("integer = " + integer);

        int i1 = Integer.parseInt(s2);
        System.out.println("i1 = " + i1);

    }
}
