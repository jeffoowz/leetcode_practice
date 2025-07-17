package main.java.s128_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        // convert the int[] num in to hashset for removing duplicate & search with O(1) time
        Set<Integer> numSet = new HashSet<>();
        int longest = 0;

        for (int val : nums) {
            numSet.add(val);
        }

        for (int val : numSet) {
            if (!numSet.contains(val - 1)) {
                int currLongest = 0;

                while (numSet.contains(val + currLongest)) {
                    currLongest = currLongest + 1;
                }

                if (currLongest > longest) {
                    longest = currLongest;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Solution ts = new Solution();
        int result = ts.longestConsecutive(new int[]{1, 2, 3});
        System.out.println(result);
    }
}