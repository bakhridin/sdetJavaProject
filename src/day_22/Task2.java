package day_22;

public class Task2 {
    public static void main(String[] args) {

       int length=20;
       boolean isEven=false;

       printEvenOrOdd(length,isEven);

    }

    static void printEvenOrOdd(int length, boolean isEven) {
        for (int i = 0; i <=length; i++) {

            if (isEven) {
                if (i%2==0) {
                    System.out.println(i);
                }

            } else {
                if (i%2!=0) {
                    System.out.println(i);
                }

            }
        }

    }


}
