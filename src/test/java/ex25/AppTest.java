package ex25;

import ex25.App;
import org.junit.jupiter.api.Test;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void test() {
        assertSame(PasswordValidator.getInstance("12345"), PasswordValidator.VERY_WEAK, "Very Weak Test failed");
        assertSame(PasswordValidator.getInstance("abcdef"), PasswordValidator.WEAK, "Weak Test failed");
        assertSame(PasswordValidator.getInstance("abc123xyz"), PasswordValidator.STRONG, "Strong Test failed");
        assertSame(PasswordValidator.getInstance("1337h@xor!"), PasswordValidator.VERY_STRONG, "Very Strong Test failed");
    }
}
