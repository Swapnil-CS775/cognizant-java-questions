package com.swapnil;

import java.util.Arrays;
import java.util.Comparator;

public class Question62 {
    public static void main(String[] args) {
        // Example 1: {{5,10},{8, 12}} -> Merges to [5, 12]. Length = 12-5 = 7.
        int[][] example1 = {{5, 10}, {8, 12}};
        ans(example1); // Output: 7

        // Complex Test Case: {{1, 5}, {2, 4}, {8, 10}, {12, 15}}
        // Merges to [1, 5] and [8, 10] and [12, 15]. Length = 4 + 2 + 3 = 9.
        int[][] example2 = {{1, 5}, {2, 4}, {8, 10}, {12, 15}};
        ans(example2); // Output: 9
    }

    public static void ans(int[][] ip) {
        if (ip == null || ip.length == 0) {
            System.out.println(0);
            return;
        }

        // Step 1: Sort by the start time (A_i)
        // This is correctly done in your original code.
        Arrays.sort(ip, Comparator.comparingInt(a -> a[0]));

        // Initialize the first merged interval
        int currentStart = ip[0][0];
        int currentEnd = ip[0][1];
        int totalCoveredLength = 0;

        // Step 2: Iterate and Merge
        for (int i = 1; i < ip.length; i++) {
            int nextStart = ip[i][0];
            int nextEnd = ip[i][1];

            if (nextStart < currentEnd) {
                // Case 1: Overlap (or nested interval). Merge.
                // Extend the current end if the new interval goes further.
                currentEnd = Math.max(currentEnd, nextEnd);
            } else {
                // Case 2: No overlap. The current merged interval is complete.
                // Add its length to the total and start a new merged interval.
                totalCoveredLength += (currentEnd - currentStart);

                // Start the next merged interval
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }

        // Step 3: Add the length of the very last merged interval
        totalCoveredLength += (currentEnd - currentStart);

        System.out.println(totalCoveredLength);
    }
}