package day_14;

import java.util.Random;

public class JavaRandomClass {
    public static void main(String[] args) {

        Random random=new Random();

        int i = random.nextInt();
        System.out.println("i = " + i);
        double d = random.nextDouble();
        System.out.println("d = " + d);


//        int i1 = random.nextInt(3);
//        System.out.println("i1 = " + i1);
//
//        int i2 = random.nextInt(30 - 25) + 25;
//        System.out.println("i2 = " + i2);
//
//
//        // random number between two double numbers
//
//        double db = random.nextDouble(30-25)+25;
//        System.out.println("db = " + db);

        int i3 = random.nextInt(5 - 2 + 1) + 2;
        System.out.println("i3 = " + i3);
        String result="YOU WON JACK POT!!!!!!!!!";

        switch (i3) {
            case 2:
                result="You won 20$" ;
                break;

             case 3:
                result="You won 30$";
                break;

            case 4:
                result="You won 40$";
                break;

        }

        System.out.println("result = " + result);




    }
}
