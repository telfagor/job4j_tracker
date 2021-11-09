package ru.job4j.tracker;

public class Cat {
    private String name;
    private String food;

    public void eat(String meal) {
        food = meal;
    }

    public void giveNick(String nick) {
        name = nick;
    }

    public void show() {
        System.out.println(name + " ел " + food);
    }

    public static void main(String[] args) {
        Cat mursik = new Cat();
        mursik.giveNick("Mursik");
        mursik.eat("рыбу");
        mursik.show();

        Cat barsik = new Cat();
        barsik.giveNick("Barsik");
        barsik.eat("котлетку");
        barsik.show();
    }
}
