package day_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaMaps_05 {
    public static void main(String[] args) {

        HashMap<String,Integer>map=new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);
        map.put("d",40);
        map.put("e",50);

        System.out.println(map);

        HashMap<Integer,String>cities=new HashMap<>();
        cities.put(85225,"Chandler");
        cities.put(85224,"Gilbert");
        cities.put(85223,"Tempe");
        cities.put(85222,"Phoenix");

        System.out.println("cities = " + cities);

        HashMap<String, ArrayList<String>>employees=new HashMap<>();

        ArrayList<String>group1=new ArrayList<>(Arrays.asList("David","Dana","Debora","Dilshod"));
        ArrayList<String>group2=new ArrayList<>(Arrays.asList("James","Jona","Jahongir","Jemo"));
        ArrayList<String>group3=new ArrayList<>(Arrays.asList("Sasha","Ivan","Feder","Vova"));

        employees.put("John",group1);
        employees.put("Ararat", group2);
        employees.put("Misha", group3);

        System.out.println(employees);
        System.out.println("===============");

        int size = employees.keySet().size();
        System.out.println("size = " + size);

        int size1 = employees.entrySet().size();
        System.out.println("size1 = " + size1);


    }
}
