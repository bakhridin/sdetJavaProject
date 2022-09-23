package day_06;

public class JavaComparisonOperators_03 {

    public static void main(String[] args) {

      int number1=5;
      int number2=7;
      boolean isBigger=number1>number2;
        System.out.println("isBigger = " + isBigger);

        isBigger(10,5);
        System.out.println(isBigger1(10, 8));


    }

    public static void isBigger(int num1, int num2) {
        boolean isBigger=num1>num2;
        System.out.println("isBigger = " + isBigger);

    }
    public static boolean isBigger1(int num1, int num2) {
        boolean isBigger=num1>num2;
        System.out.println("isBigger = " + isBigger);
        return isBigger;
    }

}
