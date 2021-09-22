/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex32;

import tools.Utils;

public class App {

    private static GameDifficulty difficulty = GameDifficulty.EASY;
    private static double number = 0;
    private static int count = 0;
    private static boolean loop = true;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Let's play Guess the Number!");
        System.out.println();
        do {
            difficulty = GameDifficulty.getDifficulty(Utils.queryValidInt("Enter the difficulty level (1, 2, or 3):"));
            if (difficulty == null) {
                System.out.println("Invalid difficulty level selected, please use 1, 2, or 3 when choosing a level");
                continue;
            }
            pickNumber();
            System.out.print("I have my number. What's your guess? ");
            do {
                count++;
            } while (!guessNumber(Utils.queryValidInt("")));


            String answer = Utils.queryValidString("Do you wish to play again (Y/N)?");
            if (answer.equalsIgnoreCase("N")) {
                loop = false;
            } else {
                count = 0;
                System.out.println();
            }
        }
        while (loop);
    }

    private static void pickNumber() {
        number = Math.floor(Math.random() * difficulty.getMaxRange()) + 1;
    }

    private static boolean guessNumber(int guess) {
        if (guess == number) {
            Utils.output("You got it in %d guesses!", count);
            return true;
        } else if (guess < number) {
            System.out.print("Too low. Guess again: ");
            return false;
        } else {
            System.out.print("Too high. Guess again: ");
            return false;
        }
    }
}