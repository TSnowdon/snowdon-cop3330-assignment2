/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex36;

import tools.Utils;

import java.util.ArrayList;

public class App {

    private static final ArrayList<Integer> values = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            if (!insertNumber(Utils.queryString("Enter a number:"))) break;
        }
        printStats();
    }

    public static boolean insertNumber(String input) {
        if (input.equalsIgnoreCase("done")) {
            return false;
        }
        try {
            values.add(Integer.parseInt(input));
        } catch (Exception e) {
            System.out.println("Invalid input, ignoring value...");
        }
        return true;
    }

    public static void printStats() {
        System.out.print("Numbers: ");
        for (Integer val : values) {
            System.out.print(val);
            if (val != (int) values.get(values.size() - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.printf("The average is %.2f\n", average());
        System.out.printf("The minimum is %d\n", min());
        System.out.printf("The maximum is %d\n", max());
        System.out.printf("The standard deviation is %.2f\n", std());
    }

    public static double average() {
        double total = 0;
        for (Integer val : values) {
            total += val;
        }
        return total / values.size();
    }

    public static int min() {
        int min = Integer.MAX_VALUE;
        for (Integer val : values) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int max() {
        int min = Integer.MIN_VALUE;
        for (Integer val : values) {
            if (val > min) {
                min = val;
            }
        }
        return min;
    }

    public static double std() {
        double numerator = 0;
        double avg = average();
        for (Integer val : values) {
            numerator += Math.pow((val - avg), 2);
        }

        return Math.sqrt(numerator / values.size());
    }
}
