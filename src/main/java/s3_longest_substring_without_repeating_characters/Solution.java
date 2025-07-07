package s3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int currentMax = 0;
        Map<String, String> temp = new HashMap<String, String>();
        for (i: s.toCharArray()){
            if (temp.containsKey(i)){

            } else {
                temp.put(i, i);
            }
        }
    }

    public static void main(String[] args) {
        Solution ts = new Solution();

    }
}