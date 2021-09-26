/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test(){
        App.addUser("John", "Johnson", "Manager", "2016-12-31");
        App.addUser("Tou", "Xiong", "Software Engineer", "2016-10-05");
        App.addUser("Michaela", "Michaelson", "District Manager", "2015-12-19");
        App.addUser("Jake", "Jacobson", "Programmer", null);
        App.addUser("Jacquelyn", "Jackson", "DBA", null);
        App.addUser("Sally", "Webber", "Web Developer", "2015-12-18");
        // before printTable();
        App.sortLastName();
        App.printTable();
    }
}
