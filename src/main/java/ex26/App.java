/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex26;

import tools.Utils;

public class App {

    public static void main(String[] args) {
        double bal = Utils.queryDouble("What is your balance?");
        double percent = Utils.queryDouble("What is your APR on the card (as a percent)?");
        double monthly = Utils.queryDouble("What is the monthly payment you can make?");

        Utils.output("It will take you %d months to pay off this card", PaymentCalculator.calculateMonthsUntilPaidOff(percent, bal, monthly));
    }
}
