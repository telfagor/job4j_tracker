package ru.job4j.poly;

public class BusTwo implements Vehicle {
    @Override
    public void move() {
        System.out.println("The bus goes on wheels");
    }

    @Override
    public void vehicleDescription() {
        System.out.println("big car for travel");
    }
}
