package day_18.mentoring_09_01_2022;

public class Task2 {
    public static void main(String[] args) {

        int num=5;
        int oddNum=0;
        int sum=0;

        for (int i = 1; i <= num; i++) {

            oddNum=2*i-1;
            System.out.println(oddNum);

            sum+=oddNum;

        }

        System.out.println("sum = " + sum);

    }
}
