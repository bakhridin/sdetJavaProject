package SaturdayProject_09_10_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 ts=new Task2();
        int helloJava = ts.getStringLength("HelloJava");
        System.out.println("helloJava = " + helloJava);

        String[]st={"java","hello","world","hellojavaworld"};

        int i = ts.longestStringLength(st);
        System.out.println("Longest String Length is = " + i);

        String str1="arizona";
        String s1 = ts.formatString(str1);
        System.out.println("Formatting String = " + s1);

        String[] strings = ts.formatStringArray(st);
        System.out.println("formatstringArray = " + Arrays.toString(strings));


        String s = ts.longestStrings(st);
        System.out.println("Longest string is = " + s);
    }

    int getStringLength(String str){
        return str.length();
    }//1
    int longestStringLength(String[] str){
        int len = 0;
        for (int i = 0; i < str.length; i++) {
            if(len < getStringLength(str[i])){
                len = getStringLength(str[i]);
            }
        }
        return len;
    }//2
    String formatString(String str)//3
    {
        str = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        return str;
    }
    String[] formatStringArray(String str[])//4
    {
        for (int i = 0; i < str.length; i++) {
            str[i] = formatString(str[i]);
        }

        return str;
    }
    String longestStrings(String str[])//5
    {
        str = formatStringArray(str);
        String ss = "";
        int a = longestStringLength(str);
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == a){
                ss = ss.concat(" " +str[i]);
            }
        }
        return ss;
    }



}