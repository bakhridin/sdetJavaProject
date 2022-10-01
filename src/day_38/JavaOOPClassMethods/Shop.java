package day_38.JavaOOPClassMethods;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product product =new Product();
        Consumer consumer=new Consumer();


        Product phone = product.getProductDetails("phone", 2, 500);
        Product laptop = product.getProductDetails("MacBook Pro", 1, 1700);
        Product tv = product.getProductDetails("LG", 1, 500);
        Product tablet = product.getProductDetails("IPad", 2, 850);
        cart.add(phone);
        cart.add(laptop);
        cart.add(tv);
        cart.add( tablet);


         Consumer consumer1 = consumer.getConsumerDetails("Ali",cart);
         consumer.print(consumer1);

        System.out.println("======================");

        System.out.println(consumer1);
        System.out.println(cart);

    }



}
