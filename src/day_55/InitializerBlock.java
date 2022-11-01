package day_55;

public class InitializerBlock {

   static  {
        System.out.println(" Static Initializer block 1");
    }

    static  {
        System.out.println(" Static Initializer block 2");
    }

    static  {
        System.out.println(" Static Initializer block 3");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }
}
