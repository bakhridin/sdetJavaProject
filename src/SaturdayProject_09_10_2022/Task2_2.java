package SaturdayProject_09_10_2022;

import java.util.Arrays;

public class Task2_2 {
    /*
    Task2

1. Create a method named as getStringLength. Method accepts a String parameter. Returns the length of the String.
2. Create a method named as longestStringLength. Method accepts a String[] parameter.
Returns the length of the longest String.
3. Create a method named as formatString. Method accepts a String parameter.
Method should format any type of String to CamelCase and return a String.
Example: "java" => "Java", "JAVA" => "Java", "JaVa" => "Java"
4. Create a method named as formatStringArray.
Method accepts a String[] parameter. Method should format all Strings within array to CamelCase and return a String[].
5. Create a method named as longestStrings. Method accepts a String[] parameter.
Format all Strings within array to Camel Case.  Return the array with the longest Strings.
Example:
{"JaVa", "iS", "FUN"} should return {"Java"} => since we have 1 String with the longest length of 4
{"JAVA", "is", "fUn", "i", "loVE", "javA"} should return {"Java", "Love", "Java"} => since we have 3 Strings with the longest length of 4.
     */

    public static void main(String[] args) {
        String str="arizona";
        int stringLength = getStringLength(str);
        System.out.println("stringLength = " + stringLength);

        System.out.println("============method2===============");

        String[] arr={"dog","appleapple","home","house","city"};
        int i = longestStringLength(arr);
        System.out.println("i = " + i);

        System.out.println("===========method3================");
        Task2_2 ts2=new Task2_2();

        String s = ts2.formatString(str);
        System.out.println("formattingString = " + s);

        System.out.println("===========method4================");

        String[] strings = ts2.formatString(arr);
        System.out.println("strings = " + Arrays.toString(strings));

        System.out.println("===========method5================");

//        String s1 = ts2.longestString(arr);
//        System.out.println("s1 = " + s1);

        String s1 = ts2.longestString(arr);
        System.out.println("s1 = " + s1);


    }

    //method1
    static int getStringLength(String str) {
        return str.length();

    }


    //method2
    static int longestStringLength(String[]str) {
        int longest=0;
        for (int i = 0; i < str.length; i++) {
            if (longest<getStringLength(str[i])) {
                longest=getStringLength(str[i]);
            }

        }
        return longest;
    }

    //method3

    String formatString(String str) {
        String str1="";
        str1=str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
        return str1;
    }

    //method4
    String[] formatString(String[]str) {
        for (int i = 0; i < str.length; i++) {
            str[i]=formatString(str[i]);
//            Arrays.toString(str);
        }


        return str;
    }

    String longestString(String[]str) {
        str=formatString(str);
        int a=longestStringLength(str);
        String ss="";
        for (int i = 0; i < str.length; i++) {

            if (str[i].length()==a) {

                ss=ss.concat(" "+str[i]);

            }


        }
        return ss;

    }




}
