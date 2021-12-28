package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = scanner.nextInt();
            count -= matches;
            System.out.println("На столе осталось " + (count != 1 ? count
                    + " спичек " : count + " спичка"));
            turn = !turn;
        }
        scanner.close();
        if (turn) {
            System.out.println("Выиграл второй игрок");
        } else {
            System.out.println("Выиграл первый игрок");
        }
    }
}
