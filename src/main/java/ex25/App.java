package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String input = queryInput("Please enter a password:");
        System.out.println("The password '" + input + "' is a " + PasswordValidator.getInstance(input).getDisplayName() + " password.");
    }

    public static String queryInput(String message) {
        System.out.print(message + " ");
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
}
