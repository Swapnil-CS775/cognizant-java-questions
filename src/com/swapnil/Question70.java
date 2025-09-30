package com.swapnil;

public class Question70 {

    // Utility function to check vowels
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // Function to extract vowels from a string
    private static String extractVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Function to compute LCS length
    private static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "education";
        String str2 = "automation";

        // Step 1: Extract vowels
        String v1 = extractVowels(str1);
        String v2 = extractVowels(str2);

        // Step 2: Find LCS
        int result = longestCommonSubsequence(v1, v2);

        System.out.println("Length of Longest Common Vowel Subsequence: " + result);
    }
}
