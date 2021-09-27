/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package tools.tabular;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

    private static final List<Map<String, String>> data = new ArrayList<>();

    public Table() {

    }

    public void addUser(String firstName, String lastName, String position, String sepData) {
        Map<String, String> user = new HashMap<>();
        user.putIfAbsent("firstName", firstName);
        user.putIfAbsent("lastName", lastName);
        user.putIfAbsent("position", position);
        user.putIfAbsent("sepData", sepData);

        data.add(user);
    }

}
