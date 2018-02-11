package p205.isomorphicStrings;

public class Solution {
  public boolean isIsomorphic(String s, String t) {
    int[] n = new int[512];
    for (int i = 0; i < n.length; i++) {
      n[i] = -1;
    }
    for (int i = 0; i < s.length(); i++) {
      if (n[s.charAt(i)] != n[t.charAt(i) + 256]) {
        return false;
      }
      n[s.charAt(i)] = i;
      n[t.charAt(i) + 256] = i;
    }
    return true;
  }
}
