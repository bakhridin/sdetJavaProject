package day_27;

public class JavaVarargs {
    public static void main(String[] args) {

        String str="a";
        String str1="b";
        String str2="c";
        String str3="d";
        String str4="e";

        printString(str,str1,str2,str3,str4);

    }

    static void printString(String... args) {
        for (String arg : args) {
            System.out.print(arg+" ");
        }

    }
}
