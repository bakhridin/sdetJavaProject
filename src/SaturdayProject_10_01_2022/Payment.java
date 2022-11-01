package SaturdayProject_10_01_2022;

public class Payment {
    public static void main(String[] args) {
        ElectricityAccount payBill=new ElectricityAccount();
        Customer customer=new Customer("Ali",35,5000,payBill);
         customer.consumeElectricity(50);
         customer.consumeElectricity(100);
         customer.consumeElectricity(200);
         payBill.calculateBill();
        System.out.println(customer);


    }

}
