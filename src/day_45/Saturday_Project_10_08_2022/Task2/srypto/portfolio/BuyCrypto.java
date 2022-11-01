package day_45.Saturday_Project_10_08_2022.Task2.srypto.portfolio;

import day_45.Saturday_Project_10_08_2022.Task2.srypto.Bitcoin;
import day_45.Saturday_Project_10_08_2022.Task2.srypto.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BuyCrypto {
     static int transactionId;

     private static final HashMap<String, ArrayList<Double>> portfolio =new HashMap<>();

     static final private ArrayList<Bitcoin> bitcoinTransactionList =new ArrayList<Bitcoin>();
     static final private ArrayList<Ethereum> ethereumTransactionList =new ArrayList<Ethereum>();

    public BuyCrypto(String crypto, double amount) {
        transactionId++;
        switch (crypto){
            case "bitcoin":
                Bitcoin bitcoin = new Bitcoin(amount);
                bitcoin.transactionId=transactionId;
                bitcoinTransactionList.add(bitcoin);
                portfolio.put(Bitcoin.shortName, new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(),Bitcoin.getTotalValue())));
                break;

            case "ethereum":
                Ethereum ethereum = new Ethereum(amount);
                ethereum.transactionId=transactionId;
                ethereumTransactionList.add(ethereum);
                portfolio.put(Ethereum.shortName,new ArrayList<>(Arrays.asList(Ethereum.getTotalAmount(),Ethereum.getTotalValue())));
                break;


        }



    }
    public static void printAllDetails() {
        for (Bitcoin eachBitcoin : bitcoinTransactionList) {
            System.out.println(eachBitcoin);
        }

        for (Ethereum eachEthereum : ethereumTransactionList) {
            System.out.println(eachEthereum);
        }
    }



    @Override
    public String toString() {
        return "BuyCrypto{" +
                "portfolio=" + portfolio +
              //  ", bitcoinTransactionList=" + bitcoinTransactionList +
              //  ", ethereumTransactionList=" + ethereumTransactionList +
                '}';
    }
}
