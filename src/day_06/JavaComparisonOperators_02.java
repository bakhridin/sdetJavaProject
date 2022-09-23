package day_06;

public class JavaComparisonOperators_02 {

    public static void main(String[] args) {
//
//        int myAge = 35;
//        int mySonAge = 11;
//
//        boolean isTrue = myAge != mySonAge;
//        System.out.println("isTrue = " + isTrue);
//
//        int myFriendsAge = 35;
//        boolean isNotEqual = !(myAge == myFriendsAge);
//        System.out.println("isNotEqual = " + isNotEqual);

        isNotEqual(50, 50);
        System.out.println(isNotEqual1(50, 50));

    }

    public static void isNotEqual(int ageOfPerson1, int ageOfPerson2) {

        boolean isNotEqual = ageOfPerson1 != ageOfPerson2;
        System.out.println("isNotEqual = " + isNotEqual);

    }

    public static boolean isNotEqual1(int ageOfPerson1, int ageOfPerson2) {

        boolean isNotEqual = ageOfPerson1 != ageOfPerson2;
        // System.out.println("isNotEqual = " + isNotEqual);

        return isNotEqual;
    }

}
