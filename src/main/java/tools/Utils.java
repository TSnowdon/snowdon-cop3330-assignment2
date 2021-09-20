package tools;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */

import java.util.Scanner;

public class Utils {

    public static String queryString(String message) {
        System.out.print(message + " ");
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static int queryInt(String message) {
        System.out.print(message + " ");
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static double queryDouble(String message) {
        System.out.print(message + " ");
        Scanner reader = new Scanner(System.in);
        return reader.nextDouble();
    }

    public static void output(String format, Object... args) {
        System.out.printf((format) + "\n", args);
    }
}
