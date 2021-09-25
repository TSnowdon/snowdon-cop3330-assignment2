/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test() {
        assertEquals("2 4 6 8 10", App.filterEvenNumbers(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
    }
}
