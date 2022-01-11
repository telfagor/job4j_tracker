package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Transport goes");
    }

    @Override
    public void passengers(int numOfPassengers) {
        System.out.println("There are 30 passengers in transport");
    }

    @Override
    public double refuel(int amountOfFuel) {
        return amountOfFuel * 4.77;
    }
}
