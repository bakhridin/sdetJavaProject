package day_24;

public class JavaVarargsTask1 {

    public static void main(String[] args) {
        JavaVarargsTask1 jm=new JavaVarargsTask1();

        int total = jm.getTotal(10, 20, 30);
        System.out.println("total = " + total);

        int average = jm.getAverage(10, 20, 30);
        System.out.println("average = " + average);


    }

    int getTotal(int... args) {
      int total=0;
        for (int arg : args) {
            total+=arg;

        }

        return total;
    }

    int getLength(int... arg) {
        return arg.length;

    }

    int getAverage(int... arg) {
        return getTotal(arg)/getLength(arg);

    }




}
