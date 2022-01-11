package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int numOfPassengers);

    double refuel(int amountOfFuel);
}
