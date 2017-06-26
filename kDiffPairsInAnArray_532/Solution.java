package kDiffPairsInAnArray_532;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int findPairs(int[] nums, int k) {
    if (k < 0 || nums == null || nums.length == 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }
    int cnt = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (k == 0) {
        if (entry.getValue() >= 2) {
          cnt++;
        }
      } else {
        if (map.containsKey(entry.getKey() + k)) {
          cnt++;
        }
      }
    }
    return cnt;
  }
}
