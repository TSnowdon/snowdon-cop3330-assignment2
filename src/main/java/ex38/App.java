/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex38;

import tools.Utils;

public class App {
    public static void main(String[] args) {
        String input = Utils.queryString("Enter a list of numbers, separated by spaces:");
        String[] numbers = input.split(" ");
        Utils.output("The even numbers are: %s", filterEvenNumbers(numbers));
    }

    public static String filterEvenNumbers(String[] input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            try {
                if (Integer.parseInt(input[i]) % 2 == 0) {
                    output.append(input[i]);
                    if (i != input.length - 1) {
                        output.append(" ");
                    }
                }
            } catch (Exception ignored) {}
        }
        return output.toString();
    }
}
