package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("The plane is flying");
    }

    @Override
    public void vehicleDescription() {
        System.out.println("Airplane - an aircraft designed to fly in the atmosphere");
    }
}
