package SaturdayProject_08_27_2022;

import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {

        /**
         * Task1:
         * Generate two numbers btw 0 and 10.
         * if both numbers have same remainder when divided by 3, return which ever is smaller.
         * if both numbers dont have same remainder when divided by 3, return whichever is larger.
         * if both numbers are equal, return sum of numbers;
         */
        Random random = new Random();

//        double db1 = random.nextDouble(10);
//        double db2 = random.nextDouble(10);
        int db1=random.nextInt(10);
        System.out.println("db1 = " + db1);
        int db2=random.nextInt(10);
        System.out.println("db2 = " + db2);
        int db3=db1%3,db4=db2%3;
        System.out.println("db3 = " + db3);
        System.out.println("db4 = " + db4);

        if (db3<=db4) {

            System.out.println("DB3 is smallest number="+db3);
        } else if (db4>=db3) {

            System.out.println("DB4 is a largest number="+db4);

        } else if (db3==db4) {

            System.out.println("Both numbers are equal and sum is "+(db3+db4));

        }




    }
}
