/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test() {
        assertEquals(15, App.addFiveNumbers(1, 2, 3, 4, 5));
    }
}