package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class AppTest {

    @Test
    public void test() {
        assertEquals(PaymentCalculator.calculateMonthsUntilPaidOff(12, 5000, 100), 70);
    }
}
