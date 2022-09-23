package day_23;

public class Task2 {
    public static void main(String[] args) {

        Task2 ts = new Task2();

        String str="I love Java";
        boolean isTrue = ts.isTrue(str);
        System.out.println("aTrue = " + isTrue);

    }


    public boolean isTrue(String str) {
          boolean b;
        if (str.length()>=8) {
               return b=true;
        }else {
            return b = false;
        }
    }
}
