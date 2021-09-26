/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex39;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static List<Map<String, String>> database = new ArrayList<>();

    public static void main(String[] args) {
        addUser("John", "Johnson", "Manager", "2016-12-31");
        addUser("Tou", "Xiong", "Software Engineer", "2016-10-05");
        addUser("Michaela", "Michaelson", "District Manager", "2015-12-19");
        addUser("Jake", "Jacobson", "Programmer", null);
        addUser("Jacquelyn", "Jackson", "DBA", null);
        addUser("Sally", "Webber", "Web Developer", "2015-12-18");
        // before printTable();
        sortLastName();
        printTable();
    }

    static void sortLastName(){
        database = database.stream()
                .sorted(Comparator.comparing(user -> user.get("lastName")))
                .collect(Collectors.toList());
    }

    public static void printTable() {
        printHeaders();
        printLine(getNameWidth());
        printLine(getColumnWidth("position") + 1);
        printLine(getColumnWidth("sepData") + 7, false);
        System.out.println();

        for (Map<String, String> user : database) {
            printUser(user);
        }

    }

    private static void printUser(Map<String, String> user) {
        System.out.print(getName(user));
        System.out.print(getPosition(user));
        System.out.print(getDate(user));
        System.out.println();
    }

    private static String getName(Map<String, String> user) {
        String firstName = user.get("firstName");
        String lastName = user.get("lastName");

        String name = firstName + "_" + lastName;
        String formatted = String.format("%-" + getNameWidth() + "s | ", name);
        return formatted.replace("_", " ");
    }

    private static String getPosition(Map<String, String> user) {
        String position = user.get("position").replace(" ", "_");

        String formatted = String.format("%-" + getColumnWidth("position") + "s | ", position);

        return formatted.replace("_", " ");
    }

    private static String getDate(Map<String, String> user) {
        String date = user.get("sepData");
        if (date == null) {
            return "";
        }

        return String.format("%-" + getColumnWidth("sepData") + "s", date);
    }

    private static void printHeaders() {
        int nameWidth = getNameWidth();
        int positionWidth = getColumnWidth("position");
        int sepWidth = getColumnWidth("sepData");

        System.out.printf("%-" + nameWidth + "s | ", "Name");
        System.out.printf("%-" + positionWidth + "s | ", "Position");
        System.out.printf("%-" + sepWidth + "s", "Separation_Date");
        System.out.println();
    }

    private static void printLine(int length) {
        printLine(length, true);
    }

    private static void printLine(int length, boolean pipe) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        if (pipe)
            System.out.print("-|");
    }


    private static int getNameWidth() {
        int min = -1;
        for (Map<String, String> user : database) {
            String firstName = user.get("firstName");
            String lastName = user.get("lastName");
            if (firstName != null && lastName != null) {
                if ((firstName.length() + lastName.length()) > min) {
                    min = (firstName.length() + lastName.length());
                }
            }
        }
        return min + 2;
    }

    private static int getColumnWidth(String key) {
        int min = -1;
        for (Map<String, String> user : database) {
            if (user.get(key) != null) {
                if (user.get(key).length() > min) {
                    min = user.get(key).length();
                }
            }
        }
        return min + 2;
    }

    public static void addUser(String firstName, String lastName, String position, String sepData) {
        Map<String, String> user = new HashMap<>();
        user.putIfAbsent("firstName", firstName);
        user.putIfAbsent("lastName", lastName);
        user.putIfAbsent("position", position);
        user.putIfAbsent("sepData", sepData);

        database.add(user);
    }
}
