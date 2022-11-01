package day_53.Inheritance.Resources;

public class Banana extends Fruit{
    String storeAddress;

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @Override
    public String toString() {
        return "\n" +getClass().getSimpleName()+
                "{ storeAddress='" + storeAddress + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
