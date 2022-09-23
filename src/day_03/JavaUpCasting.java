package day_03;

public class JavaUpCasting {

    //widening casting

    public static void main(String[] args) {

        byte bt1=(byte)50;
        short sh =(short)bt1; // Not need to do like down-casting, which is called redundancy
        int iNum1=bt1;
        long l1=bt1;
        float fl1=bt1;
        double db1=bt1;

        System.out.println("bt1 = " + bt1);
        System.out.println("sh = " + sh);
        System.out.println("iNum1 = " + iNum1);
        System.out.println("l1 = " + l1);
        System.out.println("fl1 = " + fl1);
        System.out.println("db1 = " + db1);


        long l2=5000;
        double db2=l2;
        int iNum2= (int) l2;
        float fl2=l2;
        short sh2= (short) l2;

    }
}
