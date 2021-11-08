package ru.job4j.tracker;

public class BallStory {
    public static void main(String[] args) {
        Hare h = new Hare();
        Wolf w = new Wolf();
        Fox f = new Fox();
        Ball b = new Ball();
        h.tryEat(b);
        w.tryEat(b);
        f.tryEat(b);
    }
}
