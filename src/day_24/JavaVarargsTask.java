package day_24;

public class JavaVarargsTask {

    public static void main(String[] args) {

        getTotal("Anthony",50,60,70);




    }

    public static void getTotal(String name, int... args) {
        int total=0;
        for (int i = 0; i < args.length; i++) {
            total+=args[i];

        }
        System.out.println(""+name+" "+(total)/ args.length);



    }

}
