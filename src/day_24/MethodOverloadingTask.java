package day_24;

public class MethodOverloadingTask {
    public static void main(String[] args) {
        MethodOverloadingTask mt=new MethodOverloadingTask();
        int i = mt.perimeterTr(10, 10, 20);
        System.out.println("i = " + i);

        System.out.println(mt.perimeterTr(10));

    }


    int perimeterTr(int a, int b, int c) {
        int p=a+b+c;

        return p;
    }

    int perimeterTr(int a, int b) {

        return 2*(a+b);
    }

    int perimeterTr(int a) {

        if (a == 5) {
            return 5 * (a);

        } else if (a == 8) {
            return 8 * (a);
        } else if (a == 10) {
            return 10 * (a);
        }
          return a;
    }

}
