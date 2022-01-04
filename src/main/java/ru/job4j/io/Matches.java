package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The game 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println("On the table are " + count + " matches");
            String player = turn ? "First player" : "Second player";
            int matches = Integer.parseInt(scanner.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count -= matches;
                turn = !turn;
            } else {
                System.out.println("Wrong input");
            }
        }
        scanner.close();
        if (turn) {
            System.out.println("The second player won");
        } else {
            System.out.println("The first player won");
        }
    }
}

