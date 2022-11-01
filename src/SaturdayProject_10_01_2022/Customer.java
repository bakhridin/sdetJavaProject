package SaturdayProject_10_01_2022;

public class Customer {

    String name;
    int age;
    int areaZipcode;
    ElectricityAccount account;

    public Customer(String name, int areaZipcode, ElectricityAccount account) {
        this.name = name;
        this.areaZipcode = areaZipcode;
        this.account = account;
        if (areaZipcode >= 1000 && areaZipcode < 3000) {
            account.rate = 0.9;
        } else if (areaZipcode >= 3000 && areaZipcode < 4500) {
            account.rate = 0.8;
        } else if (areaZipcode >= 4500 && areaZipcode < 7000) {
            account.rate = 0.6;
        }else {
            account.rate=0.7;
        }
    }

    public Customer(String name, int age, int areaZipcode, ElectricityAccount account) {
        this(name,areaZipcode,account);
        this.age = age;

    }

    public double consumeElectricity(double whp) {
        return account.totalWhp+=whp;
    }


    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areaZipcode=" + areaZipcode +
                ", account=" + account +
                '}';
    }
}
