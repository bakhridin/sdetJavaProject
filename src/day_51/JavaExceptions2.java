package day_51;

public class JavaExceptions2 {

    public static  void ageChecker(int age) {
        if (age < 10) {
            throw new RuntimeException("Too young to go to the cinema alone");
        } else if (age<15) {
            throw new RuntimeException("Must go to the cinema with adults");
        }else {
            System.out.println("You are allow to go to cinema");
        }
    }

    public static  void ageChecker2(int age) {
        if (age < 10) {
            throw new RuntimeException("Too young to go to the cinema alone");
        } else if (age<15) {
            throw new RuntimeException("Must go to the cinema with adults");
        }else {
            System.out.println("You are allow to go to cinema");
        }
    }

    public static void main(String[] args) {
        try {
            ageChecker(9);
            System.out.println("Try block");
        } catch (RuntimeException rn) {
            System.out.println("Catch block");
            System.out.println("rn = " + rn);
        }

//        ageChecker2(8);

    }

}
