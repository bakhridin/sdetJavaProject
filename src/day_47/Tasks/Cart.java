package day_47.Tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;


public class Cart {
    private final ArrayList<BuyProduct> list = new ArrayList<>();
    static double balanceDue;

    public void setBalanceDue() {
        for (BuyProduct product : this.list) {
            balanceDue += product.totalPrice;
        }
    }

    @Test
    private void testBalance() {
       list.add(new BuyProduct(Drink.COLA,2));
       list.add(new BuyProduct(Drink.SPRITE,1));
       list.add(new BuyProduct(Drink.FANTA,3));
       list.add(new BuyProduct(Drink.PEPSI,2));

       list.forEach(a-> System.out.println(a));

       setBalanceDue();
        String balanceDueFormat = String.format("%.2f", balanceDue);


    }
}
