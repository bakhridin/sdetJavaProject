package day_17;

public class JavaNestedLoop_01 {
    public static void main(String[] args) {
        String str = "ABC";
        int number = 5;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= number; j++) {

                System.out.print(" " + str.charAt(i) + j + " ");


            }
            System.out.println();

        }
    }
}
