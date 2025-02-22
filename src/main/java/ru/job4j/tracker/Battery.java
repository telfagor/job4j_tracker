package ru.job4j.tracker;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += load;
        this.load = 0;
    }

    public int getLoad() {
        return load;
    }
}