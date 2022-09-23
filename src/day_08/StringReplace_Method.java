package day_08;

public class StringReplace_Method {
    public static void main(String[] args) {

        String str="Txlenter";
        String replace = str.replace("Txl", "Exel");
        System.out.println("replace = " + replace);

        String str1="Java is FUN";

        String replace1 = str1.substring(8).toLowerCase().replace('u', 'a');
        System.out.println("replace1 = " + replace1);

        String newString ="Hello World Hello";

        String replace2 = newString.replace("Hello", "Hi");
        System.out.println("replace2 = " + replace2);


        String str2="Hello World Hello";

    }
}
