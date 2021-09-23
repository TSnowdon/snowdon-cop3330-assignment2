/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex34;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void test() {
        App.populateList();
        App.printList();
        System.out.println();
        App.employeeList.remove("John Smith");
        System.out.println();
        App.printList();
    }
}
