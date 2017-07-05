package combinationSumIV_377;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int combinationSum4(int[] nums, int target) {
    Arrays.sort(nums);
    Map<Integer, Integer> map = new HashMap<>();
    int ans = backtrack(map, nums, target);
    return ans;
  }
  private int backtrack(Map<Integer, Integer> map, int[]nums, int remain) {
    int res = 0;
    if (remain == 0) {
      return 1;
    } else if (map.containsKey(remain)) {
      return map.get(remain);
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (remain >= nums[i]) {
          res = res + backtrack(map, nums, remain - nums[i]);
        }
      }
      map.put(remain, res);
      return res;
    }
  }


  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3};
    System.out.println(sol.combinationSum4(nums, 32));
  }
}
