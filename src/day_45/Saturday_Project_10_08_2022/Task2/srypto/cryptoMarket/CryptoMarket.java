package day_45.Saturday_Project_10_08_2022.Task2.srypto.cryptoMarket;

import day_45.Saturday_Project_10_08_2022.Task2.srypto.portfolio.BuyCrypto;

public class CryptoMarket {
    public static void main(String[] args) {
        BuyCrypto bitcoin =new BuyCrypto("bitcoin",1.5);
        BuyCrypto ethereum =new BuyCrypto("ethereum",1.2);

        System.out.println(bitcoin);
     //  System.out.println(ethereum);
        BuyCrypto.printAllDetails();


    }
}
