package day_06;

public class JavaComparisonOperators_01 {

    public static void main(String[] args) {
        isEqual(50,50);

    }

    public static void isEqual(int myAge, int myFriendsAge) {
       boolean isEqual= myAge==myFriendsAge;
       System.out.println("isEqual = " + isEqual);

    }

}
