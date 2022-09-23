package SaturdayProject_09_10_2022;

import java.util.Arrays;

public class Task1 {
    /*
    ask1.

    1. Create a method named as reversedData. The method accepts a non-null or non-empty String as a parameter. Return a reverse of the String.
    2. Create a method named as isPalindrome. The method returns boolean and checks if the given String as parameter is Palindrome or not.
    3. Create a method named as reversedData. The method accepts an int as a parameter. Return a reverse of the int.
    4. Create a method named as reversedData. The method returns boolean and checks if the given int as parameter is Palindrome or not.

notes:
    1.Palindrome means a word or number reads the same backward as forward like "mom" ,     "refer" ,     "131" , "1221", 37573, 200002.
    2. Use method overloading.
    3. Reuse created methods.
     */
    public static void main(String[] args) {
        System.out.println("=================");
       String str="Arizona"; // madam
        String s = reversedData(str);
        System.out.println("s = " + s+" ");

        System.out.println("=================");
        boolean palindrome = isPalindrome(str);
        System.out.println("palindrome = " + palindrome);

        System.out.println("=================");

        int a=121;
        String s1 = reversedData(a);
        System.out.println("s1 = " + s1);

        System.out.println("==================");
        boolean palindrome1 = isPalindrome(a);
        System.out.println("palindrome1 = " + palindrome1);

        System.out.println("==================");

        String[] arr={"dog","apple","home","house","city"};
        String s3 = reverseArray(arr);
        System.out.println("s3 = " + s3);

        System.out.println("==================");

        String s2 = reversedData(arr);
        System.out.println("s2 = " + s2);


    }

    static String reversedData(String str) {
        String str1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1+=str.charAt(i);
        }

        return str1;
    }

    static boolean isPalindrome(String str) {

        return str.equalsIgnoreCase(reversedData(str));

    }

    static String reversedData(int a) {
        String s = String.valueOf(a);
        String str1="";
        for (int i = s.length()-1; i >=0 ; i--) {
            str1+=s.charAt(i);
        }

        return str1;
    }

    static boolean isPalindrome(int a) {
        String s = String.valueOf(a);

        return s.equalsIgnoreCase(reversedData(s));

    }

    static String reversedData(String[]arr) {
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            String tempStore=arr[i];
            arr[i]=arr[j];
            arr[j]=tempStore;


        }
        return Arrays.toString(arr);

    }

    static String reverseArray(String[] arr){
        String [] reversedArray = new String[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            reversedArray[i] = arr[j];
        }
        return Arrays.toString(reversedArray);
    }



}
