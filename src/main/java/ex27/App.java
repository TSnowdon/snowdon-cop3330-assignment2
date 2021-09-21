/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex27;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        if (employee.validateInput()) {
            System.out.println("There were no errors found.");
        }
    }

}
