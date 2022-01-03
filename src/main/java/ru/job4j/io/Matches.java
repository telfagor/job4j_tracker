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
            if (count > 3) {
                System.out.println(player + " can take 1 to 3 matches");
            } else if (count == 2) {
                System.out.println(player + " can take 1 or 2 matches");
            } else {
                System.out.println(player + " can take only 1 matches");
            }
            int matches = Integer.parseInt(scanner.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count -= matches;
                turn = !turn;
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

