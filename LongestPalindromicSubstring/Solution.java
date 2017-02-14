package LongestPalindromicSubstring;

public class Solution {
  static int low = 0;
  static int max = 0;
  public static String longestPalindrome(String s) {
    StringBuilder pString = new StringBuilder();
    int len = s.length();
    if (len < 2) {
      return s;
    }
    for (int i = 0; i < len - 1; i++) {
      palindrome(s, i, i);
      palindrome(s, i, i + 1);
    }
    return s.substring(low, low + max);
  }

  private static void palindrome(String s, int left, int right) {
    while (left >= 0 && right < s.length()
        && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    if (max < right - left - 1) {
      max = right - left -1;
      low = left + 1;
    }
  }

  public static void main (String [] args) {
    String s = "bbbbc";
    String res = longestPalindrome(s);
    System.out.println(res);
  }
}
