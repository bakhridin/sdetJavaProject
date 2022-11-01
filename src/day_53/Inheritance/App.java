package day_53.Inheritance;

import day_53.Inheritance.Resources.Apple;
import day_53.Inheritance.Resources.Banana;
import day_53.Inheritance.Resources.Fruit;
import day_53.Inheritance.Resources.Strawberry;

public class App {

    public static void main(String[] args) {
//        SubClass subClass=new SubClass();
//        subClass.name="I am from Sub Class";
//
//        System.out.println(subClass);

        Fruit fruit=new Fruit();
        fruit.setName("Fruit");
        fruit.setColor("Red");
        fruit.setPrice(200);
        System.out.println("fruit = " + fruit);

        Apple apple=new Apple();
        apple.setName("Red Apple");
        apple.setColor("Red");
        apple.setPrice(100);
        apple.setDiscount(15);
        System.out.println(apple);

        Banana banana=new Banana();
        banana.setStoreAddress("Banana Africa Store 2022");
        banana.setName("Sugar Banana");
        banana.setColor("Yellow");
        banana.setPrice(20);
        System.out.println("banana = " + banana);

        Strawberry strawberry=new Strawberry();
        strawberry.setBrand("California");
        strawberry.setOwner("Farmers World");
        strawberry.setColor("Rose");
        strawberry.setPrice(250);
        strawberry.setName("Wonderful");
        System.out.println("strawberry = " + strawberry);

    }

}
