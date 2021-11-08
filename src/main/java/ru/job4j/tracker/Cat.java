package ru.job4j.tracker;

public class Cat {
    private String name = "Барсик";
    private String food;

    public void eat(String meal) {
        food = meal;
    }

    public void giveNick(String nick) {
        name = nick;
    }

    public void show() {
        System.out.println(name + "ел " + food);
    }
}
