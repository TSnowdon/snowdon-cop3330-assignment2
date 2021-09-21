/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex28;

import tools.Utils;

public class App {
    public static void main(String[] args) {
        int total = addFiveNumbers();
        System.out.println("The total is " + total + ".");
    }

    public static int addFiveNumbers() {
        int output = 0;
        for (int i = 0; i < 5; i++) {
            output += Utils.queryInt("Enter a number:");
        }
        return output;
    }

    public static int addFiveNumbers(int... numbers) {
        int output = 0;
        for (int number : numbers) {
            output += number;
        }
        return output;
    }
}
