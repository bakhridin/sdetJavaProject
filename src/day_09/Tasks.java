package day_09;

public class Tasks {
    public static void main(String[] args) {
        String price="$5.25";
        String qty="5";

        String s = price.replaceFirst("[$]", " ");
        double v = Double.parseDouble(s);
        double v1 = Double.parseDouble(qty);

        double totalPrice=v*v1;

        System.out.println("totalPrice = " + "$"+totalPrice);


        String bitcoinPrice="$22,938.81 United States Dollar";
        String quantaty ="0.657 BTC";

        double bitcoinDouble=Double.parseDouble(bitcoinPrice.replaceAll("[^\\d.]",""));
        System.out.println("bitcoinDouble = " + bitcoinDouble);
        double bitcoinQty=Double.parseDouble(quantaty.replaceAll("[^0-9.]",""));
        System.out.println("bitcoinQty = " + bitcoinQty);

        double totalOfBtc=bitcoinDouble*bitcoinQty;
        System.out.println("totalOfBtc = $" + totalOfBtc);




    }
}
