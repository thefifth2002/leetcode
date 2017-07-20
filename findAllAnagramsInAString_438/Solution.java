package findAllAnagramsInAString_438;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> anagrams = new ArrayList<>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0) {
      return anagrams;
    }
    int[] charsOfP = new int[256];
    for (char c : p.toCharArray()) {
      charsOfP[c]++;
    }
    int left = 0;
    int right = 0;
    int cnt = p.length();
    while (right < s.length()) {
      if (charsOfP[s.charAt(right)] >= 1) {
        cnt--;
      }
      charsOfP[s.charAt(right)]--;
      right++;
      if (cnt == 0) {
        anagrams.add(left);
      }
      if (right - left == p.length()) {
        if (charsOfP[s.charAt(left)] >= 0) {
          cnt++;
        }
        charsOfP[s.charAt(left)]++;
        left++;
      }
    }
    return anagrams;
  }
}
