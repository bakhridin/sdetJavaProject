package day_39.ClassVoidMethodsExamples.JavaConsrtuctors;

import java.util.ArrayList;
import java.util.Arrays;

public class City {
    public static void main(String[] args) {
//        Bank chase=new Bank();
//        System.out.println(chase);

        Branch branch1= new Branch(1000,10012);
        Branch branch2= new Branch(2000,75555);
        ArrayList<Branch> branches=new ArrayList<>(Arrays.asList(branch1,branch2));
        Bank city=new Bank("City","www.city.com",branches);
        System.out.println(city);


    }
}
