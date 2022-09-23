package day_07;

public class StringIsEmpty_Method {
    public static void main(String[] args) {
        String str="exelenter";

        boolean empty = str.isEmpty();
        System.out.println("isEmpty = " + empty);
        str="";

        System.out.println("isEmpty = " + str.isEmpty());
    }
}
