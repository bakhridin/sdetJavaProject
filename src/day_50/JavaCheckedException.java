package day_50;

import java.io.FileInputStream;

public class JavaCheckedException {
    public static void main(String[] args) {
       // FileInputStream fis=new FileInputStream("test.txt");

        try {
            FileInputStream fis=new FileInputStream("test.txt");

        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
