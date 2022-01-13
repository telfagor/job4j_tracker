package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train rides on rails");
    }

    @Override
    public void vehicleDescription() {
        System.out.println("Train - a formed and coupled train consisting of a group of wagons, "
                            + "with one or more operating locomotives or motor wagons");
    }
}
