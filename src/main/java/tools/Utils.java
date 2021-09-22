/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package tools;

import java.util.Scanner;

public class Utils {

    public static String queryString(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static int queryInt(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static double queryDouble(String message) {
        System.out.print(message + (!message.isBlank() ? " " : ""));
        Scanner reader = new Scanner(System.in);
        return reader.nextDouble();
    }

    public static int queryValidInt(String message) {
        int output = 0;
        do {
            try {
                output = queryInt(message);
                break;
            } catch (Exception e) {
                System.out.println("Invalid number, please try again.");
            }
        } while (true);
        return output;
    }

    public static String queryValidString(String message) {
        String output = "";
        do {
            try {
                output = queryString(message);
                break;
            } catch (Exception e) {
                System.out.println("Invalid string, please try again.");
            }
        } while (true);
        return output;
    }

    public static void output(String format, Object... args) {
        System.out.printf((format) + "\n", args);
    }
}
