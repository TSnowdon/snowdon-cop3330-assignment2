/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex32;

public enum GameDifficulty {
    EASY(1, 10),
    MEDIUM(2, 100),
    HARD(3, 1000);

    private final int level;
    private final int maxRange;

    GameDifficulty(int level, int maxRage) {
        this.level = level;
        this.maxRange = maxRage;
    }

    public static GameDifficulty getDifficulty(int level) {
        for (GameDifficulty difficulty : values()) {
            if (difficulty.getLevel() == level) {
                return difficulty;
            }
        }
        return null;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxRange() {
        return maxRange;
    }
}
