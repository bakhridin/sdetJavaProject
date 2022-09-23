package day_03;

public class JavaDownCasting {
    //NarrowCasting
    public static void main(String[] args) {

        long l1=50000;
        long l2=l1;


        int iNum =100;
        int iNum2=iNum;

        int iNum4= (int) l1;

        System.out.println("iNum = " + iNum);
        System.out.println("iNum2 = " + iNum2);


        byte bt1=5;
        byte bt2=bt1;
        //DownCasting from int to byte
        byte bt3=(byte)iNum;

        System.out.println("bt1 = " + bt1);
        System.out.println("bt2 = " + bt2);


        short sh1=1500;
        short sh2=sh1;
        //DownCasting from int to short
        short sh3= (short) iNum;

        System.out.println("sh1 = " + sh1);
        System.out.println("sh2 = " + sh2);
        System.out.println("sh3 = " + sh3);


        double db1=10.50;
        double db2=db1;

        int iNum3= (int) db1;
        System.out.println("iNum3 = " + iNum3);

        float f1=11.0f;
        float f2=f1;
        float f3= (float) db1;

        int maximum = Integer.MAX_VALUE;
        int minimum =Integer.MIN_VALUE;
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);

        long l3 =123123123333333333l;
        int iNum5= (int) l3;

        System.out.println("iNum5 = " + iNum5);

        /**
         * Task1  double db1=105.3268
         *
         * long ln1=500;
         */

        double dbl1=105.3268;
        byte byt1= (byte) dbl1;
        short sht1= (short) dbl1;
        int iNum6= (int) dbl1;
        long lg1= (long) dbl1;
        float flt1= (float) dbl1;

        System.out.println("Task1");
        System.out.println("dbl1 = " + dbl1);
        System.out.println("byt1 = " + byt1);
        System.out.println("sht1 = " + sht1);
        System.out.println("iNum6 = " + iNum6);
        System.out.println("lg1 = " + lg1);
        System.out.println("flt1 = " + flt1);

        System.out.println("Task2");

        long ln1=500;
        byte byt2= (byte) ln1;
        short sht2= (short) ln1;
        int iNum7= (int) ln1;

        System.out.println("ln1 = " + ln1);
        System.out.println("byt2 = " + byt2);
        System.out.println("sht2 = " + sht2);
        System.out.println("iNum7 = " + iNum7);






    }
}
