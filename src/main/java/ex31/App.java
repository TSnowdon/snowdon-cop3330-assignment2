/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex31;

import tools.Utils;

public class App {

    public static int age;
    public static int resting;

    public static void main(String[] args) {
        readInput();
        printTable(age, resting);
    }

    public static void readInput() {
        boolean valid = true;
        do {
            try {
                age = Utils.queryInt("How old are you?");
            } catch (Exception e) {
                System.out.println("Invalid age entered, please use a real number");
                valid = false;
                continue;
            }
            if (age < 0) {
                System.out.println("Invalid age entered, please use a positive number");
                valid = false;
                continue;
            }
            try {
                resting = Utils.queryInt("What is your resting heart rate?");
            } catch (Exception e) {
                System.out.println("Invalid year entered, please use a real number");
                valid = false;
                continue;
            }
            if (resting < 0) {
                System.out.println("Invalid age entered, please use a positive number");
                valid = false;
            }
        } while (!valid);
    }

    public static void printTable(int age, int resting) {
        Utils.output("Resting Pulse: %4d\tAge:%4d", resting, age);
        System.out.println("Intensity \t| Rate\t");
        System.out.println("------------|--------");
        for (int intensity = 55; intensity < 95; intensity += 5) {
            Utils.output("%d%%\t\t\t| %.0f bpm", intensity, getTargetHeartRate(age, resting, ((double) intensity / 100)));
        }
    }

    public static double getTargetHeartRate(int age, int resting, double intensity) {
        return (((220 - age) - resting) * intensity) + resting;
    }
}
