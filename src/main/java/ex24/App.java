/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex24;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String word1 = queryInput("Enter the first string:");
        String word2 = queryInput("Enter the second string:");
        if (isAnagram(word1, word2, 0)) {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are NOT anagrams.");
        }
    }

    public static boolean isAnagram(String word1, String word2, int startIndex) {
        if (word1.length() != word2.length() || startIndex > word1.length()) {
            return false;
        }
        for (int i = 0; i < word1.length(); i++) {
            String char1 = word1.substring(startIndex, startIndex + 1);
            String char2 = word2.substring(i, i + 1);
            if (char1.equalsIgnoreCase(char2)) {
                String newWord1 = word1.substring(0, startIndex) + word1.substring(Math.min(startIndex + 1, word1.length()));
                String newWord2 = word2.substring(0, i) + word2.substring(Math.min(i + 1, word2.length()));
                return isAnagram(newWord1, newWord2, startIndex);
            }
        }
        // Ideally the trimmed down words should both be empty phrases
        return (word1.isBlank() && word2.isBlank());
    }

    public static String queryInput(String message) {
        System.out.print(message + " ");
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
}
