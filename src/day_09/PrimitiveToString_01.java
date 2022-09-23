package day_09;

public class PrimitiveToString_01 {
    public static void main(String[] args) {

        int i =5;
        String str=String.valueOf(i);
        System.out.println("str = " + str);

        //2-nd way

        String str2=Integer.toString(i);
        System.out.println("str2 = " + str2);

        byte b=1;
        String s = String.valueOf(b);
        System.out.println("s = " + s);

        String s1=Byte.toString(b);
        System.out.println("s1 = " + s1);


        short sh=10;

        String s2 = String.valueOf(sh);
        System.out.println("s2 = " + s2);

        String s3 = Short.toString(sh);
        System.out.println("s3 = " + s3);

        long ln=20;
        String s4 = String.valueOf(ln);
        System.out.println("s4 = " + s4);
        String s5 = Long.toString(ln);
        System.out.println("s5 = " + s5);


        float fl=10.3f;
        String s6 = String.valueOf(fl);
        System.out.println("s6 = " + s6);

        String s7 = Float.toString(fl);
        System.out.println("s7 = " + s7);

        double db=10.20;
        String s8 = String.valueOf(db);
        System.out.println("s8 = " + s8);
        String s9 = Double.toString(db);
        System.out.println("s9 = " + s9);


    }


}
