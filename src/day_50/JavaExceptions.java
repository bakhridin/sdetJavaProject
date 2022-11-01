package day_50;

public class JavaExceptions {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
            //num2=20--> only try and finally block executed


        try{
            int result=num1/num2;
            System.out.println("Try block");
            System.out.println("result = " + result);

        }catch(ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("ArithmeticException  handled");
        } finally {
            System.out.println("Finally block");
        }
    }
}
