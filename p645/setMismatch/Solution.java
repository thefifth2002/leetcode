package p645.setMismatch;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] findErrorNums(int[] nums) {
    int [] res = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }
    for (int i = 1; i <= nums.length; i++) {
      if (map.containsKey(i)) {
        if (map.get(i) == 2) {
          res[0] = i;
        }
      } else {
        res[1] = i;
      }
    }
    return res;
  }
}
