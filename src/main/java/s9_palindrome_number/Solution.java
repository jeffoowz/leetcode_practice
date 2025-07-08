package s9_palindrome_number;

import java.util.Objects;

public class Solution {
    public boolean isPalindrome(int x) {
        String[] arr = String.valueOf(x).split("");
        int s = arr.length / 2;
        for (int i = 0; i < s; i++) {
            if (!Objects.equals(arr[i], arr[arr.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution ts = new Solution();

        System.out.println(ts.isPalindrome(11));
    }
}
