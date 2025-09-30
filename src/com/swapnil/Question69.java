package com.swapnil;

import java.util.HashMap;
import java.util.Map;

public class Question69 {
    public static void main(String[] args) {
        String input1 = "abcabcbb";
        System.out.println("Input: " + input1 + ", Output: " + lengthOfLongestSubstring(input1)); // Expected: 3

        String input2 = "pwwkew";
        System.out.println("Input: " + input2 + ", Output: " + lengthOfLongestSubstring(input2)); // Expected: 3 ("wke" or "kew")

        String input3 = "bbbbb";
        System.out.println("Input: " + input3 + ", Output: " + lengthOfLongestSubstring(input3)); // Expected: 1
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // HashMap stores: {Character: Last_Seen_Index}
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0; // The left pointer (start) of the current unique window

        // The right pointer expands the window one character at a time.
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // 1. Check for Repetition: If the current character is already in the map
            // AND its last seen index is within the current window (>= left).
            if (charIndexMap.containsKey(currentChar)) {

                // Move the left pointer one position past the previous occurrence.
                // We use Math.max() to ensure 'left' never moves backward,
                // which is necessary if the repeated character was outside the current window.
                int newLeft = charIndexMap.get(currentChar) + 1;
                left = Math.max(newLeft, left);
            }

            // 2. Update Map: Record the current index of the character.
            charIndexMap.put(currentChar, right);

            // 3. Update Max Length: Calculate the length of the current valid window.
            // Length = right - left + 1
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

}