package s1_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> foundSet = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int next = target - current;
            if (foundSet.get(next) != null) {
                result[0] = foundSet.get(next);
                result[1] = i;
            } else {
                foundSet.put(current, i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Solution ts = new Solution();
        int[] testCase1 = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] testCase2 = ts.twoSum(new int[]{1, 2, 3}, 5);
        System.out.println(Arrays.toString(testCase1).equals("[0, 1]"));
        System.out.println(Arrays.toString(testCase2).equals("[1, 2]"));
    }
}