package day_47.Tasks;

public class BuyProduct {
    Drink drink;

    String details;

    double price;

    int qty;
    double totalPrice;


    public BuyProduct(Drink drink, int qty) {
        this.drink = drink;
        this.qty = qty;
        this.price = drink.getPrice();
        this.details = "" + drink + "has" + drink.calories + "calories";
        this.totalPrice = this.price * this.qty;
    }

    @Override
    public String toString() {
        return "BuyProduct{" +
                "drink=" + drink +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
