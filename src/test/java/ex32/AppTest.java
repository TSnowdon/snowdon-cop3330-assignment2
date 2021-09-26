/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void test() {
        App.setNumber(5);
        assertTrue(App.guessNumber(5));
    }
}
