package ru.job4j.tracker;

public class Max {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }

    public double add(double first, double second, double third, double fourth) {
        return add(first, add(second, third, fourth));
    }
}
