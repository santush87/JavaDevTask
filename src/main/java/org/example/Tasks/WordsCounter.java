package org.example.Tasks;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {

    public static int countWords(String input) {
        String[] words = input.split("\\s+"); // Split string by whitespace
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            // Remove punctuation marks
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (!word.isEmpty()) {
                // Update word count in the map
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        // Get the sum of word counts
        int totalCount = 0;
        for (int count : wordCountMap.values()) {
            totalCount += count;
        }
        return totalCount;
    }
}
