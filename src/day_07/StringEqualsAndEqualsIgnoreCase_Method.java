package day_07;

public class StringEqualsAndEqualsIgnoreCase_Method {

    public static void main(String[] args) {






        String enterYourPassword="my password";
        String repeatYourPassword="my password";

        boolean iSEquals = enterYourPassword.equals(repeatYourPassword);
        System.out.println("iSEquals = " + iSEquals);

        String enterYourPassword1="my PassworD";
        String repeatYourPassword1="my password";

        boolean isEqualsIgnoreCase = enterYourPassword1.equalsIgnoreCase(repeatYourPassword1);
        System.out.println("isEqualsIgnoreCase = " + isEqualsIgnoreCase);


        String str1="MY JAVA";
        String str2="My Java";

        boolean isTrue = str1.equalsIgnoreCase(str2);
        System.out.println("isTrue = " + isTrue);












    }
}
