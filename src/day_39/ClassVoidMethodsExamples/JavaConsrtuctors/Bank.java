package day_39.ClassVoidMethodsExamples.JavaConsrtuctors;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    ArrayList<Branch> branches= new ArrayList<Branch>();
    String name;
    String web;
    boolean isTrustable;


    // Constructors
    public Bank(){
        this.isTrustable = true;
        this.branches=new ArrayList<>();
    }
    public Bank(String name, String web, boolean isTrustable){
        this(name, web);
        this.isTrustable = isTrustable;
    }
    public Bank(String name, String web) {
        this();
        this.name = name;
        this.web = web;
    }

    public Bank(String name, String web,ArrayList<Branch> branches ) {
        this(name, web);
        this.branches = branches;


    }

    public void print() {
        System.out.println("Branches list");
        for (Branch branch : this.branches) {
            System.out.println(branch);

        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "branches=" + branches +
                ", name='" + name + '\'' +
                ", web='" + web + '\'' +
                ", isTrustable=" + isTrustable +
                '}';
    }
}
