package SaturdayProject_08_27_2022;

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {

                       /*Task4.
Create random number between 1000 and 2000.
Using loop, count total of each number.
Example: randomNumber = 6457; result = 6+4+5+7
*/

        Random rnd = new Random();

        int randomNumber = rnd.nextInt(1000, 2000);
        System.out.println("randomNumber = " + randomNumber);
        int count=0;

        for (int i = randomNumber; i>=0; i--) {
            count+=randomNumber%10;
            randomNumber/=10;

        }
        System.out.println("count = " + count);

    }
}
