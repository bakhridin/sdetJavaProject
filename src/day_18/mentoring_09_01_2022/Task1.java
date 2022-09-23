package day_18.mentoring_09_01_2022;

public class Task1 {

    public static void main(String[] args) {
        for (int i = 0; i<=4 ; i++) {
            for (int j =0; j<i; j++) {
                System.out.print(" * ");

            }

            System.out.println(" ");
        }

                for (int i = 5; i>=1 ; i--) {
            for (int j =i; j>=1; j--) {
                System.out.print(" * ");

            }
            System.out.println(" ");

        }
    }

}
