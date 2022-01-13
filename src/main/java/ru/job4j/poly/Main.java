package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new BusTwo();
        Vehicle[] vehicles = {plane, train, bus};
        for (Vehicle v : vehicles) {
            v.move();
            v.vehicleDescription();
        }
    }
}
