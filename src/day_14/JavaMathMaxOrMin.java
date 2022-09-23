package day_14;

public class JavaMathMaxOrMin {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;

        int largest=num1>num2 ? num1 :num2;
        System.out.println("largest = " + largest);

        int smallest =num1>num2 ? num2 : num1;
        System.out.println("smallest = " + smallest);

        int largest1=Math.max(num1,num2);
        System.out.println("largest1 = " + largest1);

        int smallest1 = Math.min(num1, num2);
        System.out.println("smallest1 = " + smallest1);
    }
}
