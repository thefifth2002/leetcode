package longestHarmoniousSubsequence_594;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int findLHS(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int cnt = 0;
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int key : map.keySet()) {
      if (map.containsKey(key + 1)) {
        cnt = Math.max(cnt, map.get(key) + map.get(key + 1));
      }
    }
    return cnt;
  }
}
