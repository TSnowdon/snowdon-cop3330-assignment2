/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void test() {
        String password = App.generatePassword(8, 2, 2);
        assertTrue(password.length() > 8 + 2 + 2);
        assertTrue(App.SPECIAL_CHARACTERS.stream().anyMatch(password::contains));
        assertTrue(App.LETTERS.stream().anyMatch(password::contains));
        assertTrue(password.matches("^(.)*(\\d)+(.)*$"));
    }
}
