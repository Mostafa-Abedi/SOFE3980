package org.example;

public class CharacterCounter {
    public static int countOccurrences(char[] charArray, char target) {
        int count = 0;
        for (char c : charArray) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}