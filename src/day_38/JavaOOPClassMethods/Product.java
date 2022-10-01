package day_38.JavaOOPClassMethods;

import java.util.ArrayList;

public class Product {

    String productName;
    int productQty;
    double productPrice;

   public Product getProductDetails(String productName, int productQty, double productPrice){
        Product product = new Product();
        product.productName = productName;
        product.productQty = productQty;
        product.productPrice = productPrice<0 ? 0 : productPrice;
        return product;
    }

    public void print(ArrayList<Product> cart){
        System.out.println("Items in the cart : ");
        for(Product product : cart){
            System.out.println(product.productName + " : "
                    + product.productQty + " * $"
                    + product.productPrice + "; ");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQty=" + productQty +
                ", productPrice=" + productPrice +
                '}';
    }
}
