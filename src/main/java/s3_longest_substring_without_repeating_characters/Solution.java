package s3_longest_substring_without_repeating_characters;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution ts = new Solution();
        int testCase1 = ts.lengthOfLongestSubstring("dvdf");
        System.out.println(testCase1);

    }
}