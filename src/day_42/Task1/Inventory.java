package day_42.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
   static final ArrayList<Car> inventoryList=new ArrayList<>();

    public static void main(String[] args) {
        Car car1=new Car("BMW","X4",220,150000);
        Car car2=new Car("Volvo","s80",200,120000);
        Car car3=new Car("Mercedes","DR6",300,200000);

        Inventory.inventoryList.add(car1);
        Inventory.inventoryList.add(car2);
        Inventory.inventoryList.add(car3);

        System.out.println(inventoryList);

    }
}
