package s26_remove_duplicates_from_sorted_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i=0; i < nums.length; i++) {
          numSet.add(nums[i]);
        }

        return numSet.size();
    }

    public static void main(String[] args) {
        Solution ts = new Solution();

        int result = ts.removeDuplicates(new int[]{1,1,2});

        System.out.println(result);
    }
}