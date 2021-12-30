package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputControl(String player, int limit) {
        String message;
        if (limit == 3) {
            message = player + " can take 1 to 3 matches";
        } else if (limit == 2) {
            message = player + " can take 1 or 2 matches";
        } else {
            message = player + " can take 1 match";
        }
        int matches;
        do {
            System.out.println(message);
            matches = Integer.parseInt(scanner.nextLine());
        } while (matches < 1 || matches > limit);
        return matches;
    }

    public static void main(String[] args) {
        System.out.println("The game 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println("On the table are " + count + " matches");
            String player = turn ? "First player" : "Second player";
            int matches;
            if (count >= 3) {
                matches = inputControl(player, 3);
            } else if (count == 2) {
                matches = inputControl(player, 2);
            } else {
                matches = inputControl(player, 1);
            }
            count -= matches;
            turn = !turn;
        }
        scanner.close();
        if (turn) {
            System.out.println("The second player won");
        } else {
            System.out.println("The first player won");
        }
    }
}

