package SaturdayProject_10_01_2022;

public class ElectricityAccount {

    double totalWhp;
    double rate;
    double bill;




    public double calculateBill() {
        return bill= rate*totalWhp;
    }

    @Override
    public String toString() {
        return "ElectricityAccount{" +
                "totalWhp=" + totalWhp +
                ", rate=" + rate +
                ", bill=" + bill +
                '}';
    }
}



