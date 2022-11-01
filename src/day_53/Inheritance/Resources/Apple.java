package day_53.Inheritance.Resources;

public class Apple extends Fruit{

    int discount;


    public void setDiscount(int discount) {
        this.discount = discount;

    }

    @Override
    public void setPrice(double price) {
      // super.setPrice(price-(price*discount/100));
        super.price=price-(price*discount/100);
    }
}
