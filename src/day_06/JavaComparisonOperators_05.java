package day_06;

public class JavaComparisonOperators_05 {

    public static void main(String[] args) {

        int number3 = 10;
        int number4 = 10;
        System.out.println(number3 <= number4);

        boolean isSmaller = number3 <= number4;
        System.out.println("isSmaller = " + isSmaller);

        isSmallerOrEqual(20, 20);
        System.out.println(isSmallerOrEqual1(30, 30));


    }

    public static void isSmallerOrEqual(int num1, int num2) {
        boolean isSmallerOrEqual = num1 <= num2;
        System.out.println("isSmallerOrEqual = " + isSmallerOrEqual);

    }

    public static boolean isSmallerOrEqual1(int num1, int num2) {
        boolean isSmallerOrEqual = num1 <= num2;
        System.out.println("isSmallerOrEqual = " + isSmallerOrEqual);

        return isSmallerOrEqual;
    }

}
