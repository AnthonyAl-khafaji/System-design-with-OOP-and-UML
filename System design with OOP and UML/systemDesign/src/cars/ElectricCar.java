package cars;

import vehicles.Vehicle;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("Electric car started.");
    }
}