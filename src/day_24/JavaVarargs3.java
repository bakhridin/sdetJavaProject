package day_24;

public class JavaVarargs3 {

    public static void main(String[] args) {

        int total = getTotal(10, 20, 30, 40, 50, 60);
        System.out.println("total = " + total);

        int[]b={10,20,30};

        int total1 = getTotal(b);
        System.out.println("total1 = " + total1);


    }

    public static int getTotal(int... args) {
        int total=0;
        for (int i = 0; i < args.length; i++) {
            total+=args[i];

        }
        return total;

    }

}
