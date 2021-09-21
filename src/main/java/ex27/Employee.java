/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex27;

import tools.Utils;

public class Employee {
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    private static final int MIN_NAME_LENGTH = 2;
    private static final String EMPLOYEE_ID_FORMAT = "AA-1234";

    public Employee() {
        this.firstName = Utils.queryString("Enter the first name:");
        this.lastName = Utils.queryString("Enter the last name:");
        this.zipCode = Utils.queryString("Enter the ZIP CODE:");
        this.employeeID = Utils.queryString("Enter the employee ID:");
    }

    public Employee(String firstName, String lastName, String zipCode, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    public boolean validateInput() {
        boolean isValid = true;
        if (!checkNameFilled(firstName, "first name")) {
            isValid = false;
        }
        if (!checkNameFilled(lastName, "last name")) {
            isValid = false;
        }
        if (!checkNameLength(firstName, "first name")) {
            isValid = false;
        }
        if (!checkNameLength(lastName, "last name")) {
            isValid = false;
        }
        if (!validateEmployeeID(employeeID)) {
            isValid = false;
        }
        if (!validateZipCode(zipCode)) {
            isValid = false;
        }
        return isValid;
    }

    private boolean checkNameFilled(String name, String type) {
        if (name.isBlank()) {
            System.out.printf("The %s must be filled in.\n", type);
            return false;
        }
        return true;
    }

    private boolean checkNameLength(String name, String type) {
        if (name.length() < MIN_NAME_LENGTH) {
            System.out.printf("The %s must be at least %d characters long.\n", type, MIN_NAME_LENGTH);
            return false;
        }
        return true;
    }

    private boolean validateEmployeeID(String employeeID) {
        if (!employeeID.matches("^(\\w){2}(-)+(\\d){4}$")) {
            System.out.printf("The employee ID must be in the format of %s.\n", EMPLOYEE_ID_FORMAT);
            return false;
        }
        return true;
    }

    private boolean validateZipCode(String zipCode) {
        if (!zipCode.matches("^(\\d){5}$")) {
            System.out.print("The zipcode must be a 5 digit number.\n");
            return false;
        }
        return true;
    }
}
