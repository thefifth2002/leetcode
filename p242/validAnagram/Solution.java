package p242.validAnagram;

import java.util.Arrays;

public class Solution {
  public boolean isAnagram(String s, String t) {
    char[] s_chars = s.toCharArray();
    char[] t_chars = t.toCharArray();
    Arrays.sort(s_chars);
    Arrays.sort(t_chars);
    return Arrays.equals(s_chars, t_chars);
  }
  public boolean isAnagram2(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] is = new int[26];
    for (int i = 0; i < s.length(); i++) {
      is[s.charAt(i) - 'a']++;
      is[t.charAt(i) - 'a']--;
    }
    for (int n : is) {
      if (n != 0) {
        return false;
      }
    }
    return true;
  }
}
