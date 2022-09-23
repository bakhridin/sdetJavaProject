package day_32;

import java.util.HashMap;

public class Task1 {

    public static void main(String[] args) {

        HashMap<Integer,String>stCode=new HashMap<>();

        stCode.put(100,"Continue");
        stCode.put(101,"Switching Protocols");
        stCode.put(103,"Early Hints");
        stCode.put(200,"OK");

        System.out.println("stCode = " + stCode);


    }
}
