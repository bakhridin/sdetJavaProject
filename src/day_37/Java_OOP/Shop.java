package day_37.Java_OOP;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Product product = setValue("phone", 2, 500D);
        Consumer consumer = getConsumerDetails("Ali", product);
        print(consumer);

    }

    public static Product setValue(String productName, int productQty, double productPrice) {
        Product product = new Product();
        product.productName = productName;
        product.productQty = productQty;
        product.productPrice = productPrice < 0 ? 0 : productPrice;
        return product;
    }

    public static double getPayment(Product product) {

//      double  totalPayment=(product.productPrice*product.productQty);
//        return totalPayment;
        return product.productQty * product.productPrice;

    }

    public static double getPayment(ArrayList<Product> cart) {
        double total = 0;
        for (Product product : cart) {
            total += product.productPrice * product.productPrice;
        }

        return total;

    }

    public static Consumer getConsumerDetails(String name, Product product) {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.product = product;
        consumer.balanceDue = getPayment(product);

        return consumer;
    }

    public static Consumer getConsumerDetails(String name, ArrayList<Product> cart) {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getPayment(cart);

        return consumer;
    }

    public static Consumer allConsumerAtributes(String name, double balanceDue, Product product) {
        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.balanceDue = balanceDue;
        consumer.product = product;
        return consumer;
    }

    public static void print(Consumer consumer) {
        System.out.print("Consumer name :" + consumer.name);
//        print(consumer.cart);
        System.out.print(", Product :" + consumer.product.productName);
        System.out.print(", QTY :" + consumer.product.productQty);
        System.out.print(", Price:" + consumer.product.productPrice);
        System.out.print(", BalanceDue : $" + consumer.balanceDue);
    }

//    public static void print(ArrayList<Product>cart) {
//        System.out.println("Items in the cart are : ");
//        for (Product product : cart) {
//            System.out.print(product.productName+" : "+ product.productQty+" * "+product.productPrice);
//        }
//
//    }

}




