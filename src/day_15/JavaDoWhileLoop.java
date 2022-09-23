package day_15;

import java.util.Scanner;

public class JavaDoWhileLoop {
    public static void main(String[] args) {

//        int num=10;
//
//        do {
//            System.out.print("Hello");
//            System.out.print("World");
//            System.out.print("!!!");
//            num++;
//            System.out.println("num = " + num);
//
//        }while (num<10);


        String str1="Java is Fan";
        int ind=0;

        do {
            System.out.print(str1.charAt(ind));
            ind++;
        }while (ind<str1.length());


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number=> ");
        int num1 = scan.nextInt();
        System.out.print("Enter a power=> ");
        int num2 = scan.nextInt();

        int total=1;
        int count=0;

        do {
             total*=num1;
             count++;
        } while (count<num2);

        System.out.println("total = " + total);


    }
}
