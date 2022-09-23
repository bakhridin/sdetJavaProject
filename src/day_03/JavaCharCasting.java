package day_03;

public class JavaCharCasting {
    public static void main(String[] args) {
        int num1=70;
        byte bt1=84;

        char ch1= (char) num1;
        char ch2= (char) bt1;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);


        double db1=97.012123123123123123;
        char ch3= (char) db1;

        System.out.println("ch3 = " + ch3);

        /**
         * create different primitive datatype and assign value to print Worlds
         */
        byte W=119;
        short O=111;
        int R=114;
        float L=108;
        long D=100;
        double S=115;

        char ch11= (char) W;
        char sh12= (char) O;
        char ch13= (char) R;
        char ch14= (char) L;
        char ch15= (char) D;
        char ch16= (char) S;

        System.out.print(ch11);
        System.out.print(sh12);
        System.out.print(ch13);
        System.out.print(ch14);
        System.out.print(ch15);
        System.out.println(ch16);
        System.out.println(""+ch11+sh12+ch13+ch14+ch15+ch15);
        System.out.println(ch11+sh12+ch13+ch14+ch15+ch15);

    }
}
