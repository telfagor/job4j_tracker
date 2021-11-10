package ru.job4j.tracker;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return (double) x / y;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sumAllOperation(11));
    }
}
