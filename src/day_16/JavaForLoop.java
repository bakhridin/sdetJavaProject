package day_16;

public class JavaForLoop {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//
//        }

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
//
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));

        }

    }
}
