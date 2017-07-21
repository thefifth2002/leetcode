package longestPalindrome_409;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int longestPalindrome(String s) {
    int cnt = 0;
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
      if (set.contains(c)) {
        cnt++;
        set.remove(c);
      } else {
        set.add(c);
      }
    }
    return cnt * 2 + (set.isEmpty() ? 0 : 1);
  }
}
