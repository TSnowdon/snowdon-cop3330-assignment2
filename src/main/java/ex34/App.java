/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex34;

import tools.Utils;

import java.util.ArrayList;

public class App {

    public static final ArrayList<String> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        populateList();
        printList();
        System.out.println();
        employeeList.remove(Utils.queryString("Enter an employee name to remove:"));
        System.out.println();
        printList();
    }

    public static void populateList() {
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
    }

    public static void printList() {
        System.out.printf("There are %d employees:\n", employeeList.size());
        for (String name : employeeList) {
            System.out.println(name);
        }
    }
}
