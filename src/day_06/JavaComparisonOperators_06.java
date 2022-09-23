package day_06;

public class JavaComparisonOperators_06 {

    public static void main(String[] args) {

        isBiggerOrEqual(10, 10);
        System.out.println(isBiggerOrEqual1(30, 20));
    }

    public static void isBiggerOrEqual(int num1, int num2) {
        boolean isBiggerOrEqual = num1 >= num2;
        System.out.println("isBiggerOrEqual = " + isBiggerOrEqual);

    }

    public static boolean isBiggerOrEqual1(int num1, int num2) {
        boolean isBiggerOrEqual = num1 >= num2;
        System.out.println("isBiggerOrEqual = " + isBiggerOrEqual);

        return isBiggerOrEqual;
    }

}
