package ru.job4j.tracker;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another, int charges) {
        load -= charges;
        another.load += charges;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        first.exchange(second, 30);
    }
}
