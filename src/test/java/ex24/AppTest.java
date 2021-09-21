/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex24;

import ex24.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void test() {
        assertTrue(App.isAnagram("note", "tone", 0), "Test failed");
    }
}
