package ex30;

import tools.Utils;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final int TIMES_TABLE_VAL = 12;

    public static void main(String[] args) {
        printTimesTable(TIMES_TABLE_VAL);
    }

    public static void printTimesTable(int amount) {
        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j <= amount; j++) {
                System.out.printf("%4.0f ", (float) (i * j));
                if (j == amount) {
                    System.out.println();
                }
            }
        }
    }
}
