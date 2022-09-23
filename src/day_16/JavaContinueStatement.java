package day_16;

public class JavaContinueStatement {
    public static void main(String[] args) {
        String str = "Java is fun";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                continue;
            }
            System.out.print( str.charAt(i));

        }
    }
}
