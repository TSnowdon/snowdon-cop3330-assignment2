/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test() {
        App.insertNumber("100");
        App.insertNumber("200");
        App.insertNumber("1000");
        App.insertNumber("300");
        assertEquals(400, App.average());
        assertEquals(100, App.min());
        assertEquals(1000, App.max());
        assertEquals(353.5533905932738, App.std());
    }
}
