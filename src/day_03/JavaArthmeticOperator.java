package day_03;

public class JavaArthmeticOperator {
    public static void main(String[] args) {
        //Plus, addition

        int num1=3;
        int num2=20;
        int total =num1+num2;

        //minus, subtraction
        int subs=num2-num1;

        //multiplication

        int mult = num1*num2;

        //divide

        int div = num2/num1;

        double dbDiv=num2/num1;
        double dbDiv1=(double)num2/num1; //When you divide double by int you will get correct answer
        //double/int ==ok;
        //double/double ==ok;
        //int /double==ok;
        //int/int ==wrong math calculation;

        System.out.println("dbDiv = " + dbDiv1);

        float fl =50.0f/7.0f;
        System.out.println("fl = " + fl);

        int num3=100;
        short sh =50;

        byte total1 = (byte) (num3+sh);

        System.out.println("total1 = " + total1);









    }
}
