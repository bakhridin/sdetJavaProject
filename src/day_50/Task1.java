package day_50;

public class Task1 {
    public static void main(String[] args) {


        String[] str = new String[]{"Java"};
//        str[5] = str[5];
//        System.out.println("str = " + str);

        try {
            str[5] = str[5];
            System.out.println("str = " + str);

            System.out.println("Try block, wrong code");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide correct data type");
        }
    }
}
