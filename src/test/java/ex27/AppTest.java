/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void test() {
        Employee test = new Employee("John", "Johnson", "55555", "TJ-1234");
        assertTrue(test.validateInput());
    }
}
