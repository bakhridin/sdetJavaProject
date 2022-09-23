package day_06;

public class JavaComparisonOperators_04 {

    public static void main(String[] args) {

        int number3 = 15;
        int number4 = 10;

        System.out.println(number3 < number4);

        boolean isSmaller = number3 < number4;
        System.out.println("isSmaller = " + isSmaller);

        isSmaller(10,15);
        System.out.println(isSmaller1(20, 10));
    }

    public static void isSmaller(int num1, int num2) {
        boolean isSmaller =num1<num2;
        System.out.println("isSmaller = " + isSmaller);
    }

    public static boolean isSmaller1(int num1, int num2) {
        boolean isSmaller =num1<num2;
        System.out.println("isSmaller = " + isSmaller);
        return isSmaller;
    }

}
