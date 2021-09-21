/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex25;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public enum PasswordValidator {
    VERY_WEAK("very weak", string -> {
        return string.matches("^[\\d]{1,8}$"); // One or eight digits
    }),
    WEAK("weak", string -> {
        return string.matches("^[A-z]{1,8}$"); // One or eight letters
    }),
    STRONG("strong", string -> {
        if (string.matches("(.)*(\\d)+(.)*")) { // One or more digit
            return string.matches("(.)*([A-z])+(.)*") && string.length() >= 8; // Contain letters and is at least 8 characters long
        }
        return false;
    }),
    VERY_STRONG("very strong", string -> {
        if (string.matches("(.)*(\\d)+(.)*")) {
            if (string.matches("(.)*([A-z])+(.)*")) {
                if (string.matches("(.)*(\\W)+(.)*")) {
                    return string.length() >= 8;
                }
            }
        }
        return false;
    });

    private final String displayName;
    private final Predicate<String> condition;

    PasswordValidator(String displayName, Predicate<String> condition) {
        this.displayName = displayName;
        this.condition = condition;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static PasswordValidator getInstance(String input) {
        for (int i = values().length - 1; i >= 0; i--) {
            if (values()[i].condition.test(input)) {
                return values()[i];
            }
        }
        // Don't know how you got here
        return VERY_WEAK;
    }
}
