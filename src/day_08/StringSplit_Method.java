package day_08;

import java.util.Arrays;

public class StringSplit_Method {

    public static void main(String[] args) {


        String str ="myemail@gmail.com";

        String[] split = str.split("@");
        System.out.println(Arrays.toString(split));


        String str1="I love java. Java is FUn. I will be a good software engineer";

        String[] s = str1.split(" ");
        System.out.println(Arrays.toString(s));

        String[] s1 = str1.split(" ", 4);
        System.out.println(Arrays.toString(s1));


    }

}
