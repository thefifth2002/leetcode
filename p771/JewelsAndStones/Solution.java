package p771.JewelsAndStones;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int numJewelsInStones(String J, String S) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < S.length(); i ++) {
      map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
    }
    int cnt = 0;
    for (int i = 0; i < J.length(); i++) {
      if (map.containsKey(J.charAt(i))) {
        cnt += map.get(J.charAt(i));
      }
    }
    return cnt;
  }
}
