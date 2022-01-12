package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        StudentTwo andrei = new Freshman();
        Object o = andrei;
        System.out.println("Это называется up casting");
    }
}
