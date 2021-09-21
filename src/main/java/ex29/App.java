/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex29;

import tools.Utils;

public class App {
    public static void main(String[] args) {
        // years = 72 / r
        Utils.output("It will take %d years to double your initial investment.", calcReturn());
    }

    public static int calcReturn() {
        return calcReturn(-1);
    }

    public static int calcReturn(int override) {
        int r = 0;
        do {
            try {
                if (override == -1) {
                    r = Utils.queryInt("What is the rate of return?");
                } else {
                    r = override;
                }
            } catch (Exception ignored) {
            }
            if (r != 0) {
                break;
            } else {
                Utils.output("Sorry. That's not a valid input.");
            }
        } while (true);
        return (72 / r);
    }
}
