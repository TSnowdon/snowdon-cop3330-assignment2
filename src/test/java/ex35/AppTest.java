/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex35;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void test() {
        App.addContestant("Homer");
        App.addContestant("Bart");
        App.addContestant("Maggie");
        App.addContestant("Lisa");
        App.addContestant("Moe");

        for (int i = 0; i < 1; i++) {
            App.pickWinner();
        }
    }
}
