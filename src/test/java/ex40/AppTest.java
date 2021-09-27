/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex40;

import org.junit.jupiter.api.Test;
import tools.Utils;

public class AppTest {
    @Test
    public void test() {
        App.addUser("John", "Johnson", "Manager", "2016-12-31");
        App.addUser("Tou", "Xiong", "Software Engineer", "2016-10-05");
        App.addUser("Michaela", "Michaelson", "District Manager", "2015-12-19");
        App.addUser("Jake", "Jacobson", "Programmer", null);
        App.addUser("Jacquelyn", "Jackson", "DBA", null);
        App.addUser("Sally", "Webber", "Web Developer", "2015-12-18");
        App.searchDatabase("Jac");
        System.out.println();
        System.out.println("Results");
        System.out.println();
        App.printTable();
    }
}
