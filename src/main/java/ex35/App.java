/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex35;

import tools.Utils;

import java.util.ArrayList;

public class App {

    private static ArrayList<String> contestants = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            if (!addContestant(Utils.queryString("Enter a name:"))) break;
        }
        pickWinner();
    }

    public static boolean addContestant(String input) {
        if (input.isBlank()) {
            return false;
        }
        return contestants.add(input);
    }

    public static void pickWinner() {
        System.out.printf("The winner is... %s.\n", getRandomContestant());
    }

    public static String getRandomContestant() {
        return contestants.get((int) Math.round((contestants.size() - 1) * Math.random()));
    }
}
