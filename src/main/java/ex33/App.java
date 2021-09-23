/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex33;

import java.util.Scanner;

public class App {

    private static final String[] OPTIONS = new String[]{"Yes", "No", "Maybe", "Ask again later"};

    public static void main(String[] args) {
        prompt();
    }

    public static void prompt() {
        System.out.print("What's your question?\n> ");
        Scanner reader = new Scanner(System.in);
        String response = reader.nextLine();
        System.out.println();
        answer();
    }

    public static void answer() {
        System.out.println(pickAnswer() + ".");
    }

    public static String pickAnswer() {
        int index = (int) Math.round(Math.random() * OPTIONS.length);
        return OPTIONS[index];
    }
}
