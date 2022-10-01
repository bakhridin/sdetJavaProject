package day_38.JavaOOPClassMethods.JavaMethods_2;

public class DealerShip {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = car.setCarAttributes("Volvo", "S80", 2022, 90000D);
        Car car2 = car.setCarAttributes("BMW", "M4", 2022, 100000D);

        System.out.println(car1);
        System.out.println(car2);

    }
}
