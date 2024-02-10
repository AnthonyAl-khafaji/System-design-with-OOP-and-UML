package test;

import cars.Car;
import cars.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022, "Camry");
        car1.start();
        car1.stop();

        ElectricCar electricCar = new ElectricCar("Tesla", 2023, "Model S", 100);
        electricCar.start();
        electricCar.stop();
    }
}