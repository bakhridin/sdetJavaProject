package day_14;

public class JavaMathPow {
    public static void main(String[] args) {

        int num1=2;
        int num2=3;

        double pow = Math.pow(num1, num2);
        System.out.println("pow = " + pow);

        double pow1 = Math.pow(num2, num1);
        System.out.println("pow1 = " + pow1);

    }
}
