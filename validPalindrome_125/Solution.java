package validPalindrome_125;

public class Solution {
  public boolean isPalindrome(String s) {
    if (s == "") {
      return true;
    }
    int start = 0;
    int end = s.length();
    s = s.toLowerCase();
    while (start < end) {
      char first = s.charAt(start);
      char last = s.charAt(end - 1);
      if (!Character.isLetterOrDigit(first)) {
        start++;
      } else if (!Character.isLetterOrDigit(last)) {
        end--;
      } else if (s.charAt(start) != s.charAt(end - 1)) {
        return false;
      } else {
        start++;
        end--;
      }
    }
    return true;
  }
}
