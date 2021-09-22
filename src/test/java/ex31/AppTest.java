/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test() {
        assertEquals(138, App.getTargetHeartRate(22, 65, (55f / 100f)));
        App.printTable(22, 65);
    }
}
