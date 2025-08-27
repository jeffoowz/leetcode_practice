package s3_longest_palindromic_substring;

public class Solution {
  public String longestPalindrome(String s) {
    // purpose: find the longest palindromic substring in s
    // input: string
    // output: substring that is the longest palindromic substring
    // constraint
    // 1. s is not empty
    // 2. s can either be integer or english letter
    // solution: for loop
    // parse string to a string[]
    // with a for loop to work on, if the
    // b
    String[] strings = s.split("");
    String longest = "";

    for (int i = 0; i < s.length(); i++) {
      String currentLongest = "";
      while (i < s.length() - 1 && strings[i] != strings[i + i]) {
        currentLongest = strings[i] + strings[i + 1];
        i++;
      }

      if (currentLongest.length() > longest.length()) {
        longest = currentLongest;
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    Solution ts = new Solution();
    String result = ts.longestPalindrome("sss");

    System.out.println(result);
  }
}