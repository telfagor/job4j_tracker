package ru.job4j.tracker;

public class Max {
    public double max(double first, double second) {
        return Math.max(first, second);
    }

    public double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    public double max(double first, double second, double third, double fourth) {
        return max(first, max(second, third, fourth));
    }
}
