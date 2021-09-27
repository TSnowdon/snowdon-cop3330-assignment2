/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex37;

import tools.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static final ArrayList<String> LETTERS = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    public static final ArrayList<String> SPECIAL_CHARACTERS = new ArrayList<>(List.of("!", "@", "#", "$", "%", "^", "&", "*", "-", "_"));

    public static void main(String[] args) {
        int length = Utils.queryInt("What's the minimum length?");
        int special = Utils.queryInt("How many special characters?");
        int numbers = Utils.queryInt("How many numbers?");
        System.out.println("Your password is " + generatePassword(length, special, numbers) + ".");
    }

    public static String generatePassword(int length, int special, int number) {
        length = Math.max(length, (special + number));
        String[] password = new String[length];
        ArrayList<Integer> positions = IntStream.rangeClosed(0, length - 1).boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(positions);

        for (int i = 0; i < length; i++) {
            password[i] = LETTERS.get(getRandomNumber(LETTERS.size() - 1));
        }

        for (int i = 0; i < special; i++) {
            int position = positions.get(0);
            password[position] = SPECIAL_CHARACTERS.get(getRandomNumber(SPECIAL_CHARACTERS.size() - 1));
            positions.remove((Integer) position);
        }

        for (int i = 0; i < number; i++) {
            int position = positions.get(0);
            password[position] = Integer.toString(getRandomNumber(9));
            positions.remove((Integer) position);
        }
        return String.join("", password);
    }

    private static int getRandomNumber(int max) {
        return (int) Math.round(Math.random() * max);
    }
}
