package org.example.Tasks;

import java.util.HashMap;

public class Duplicates {

    public static void findDuplicateCharacters(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Convert to lowercase to ignore case sensitivity
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print characters with count > 1
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c));
            }
        }
    }
}
