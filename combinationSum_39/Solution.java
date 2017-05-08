package combinationSum_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(ans, new ArrayList<>(), candidates, target, 0);
    return ans;
  }
  private void backtrack(List<List<Integer>> list, List<Integer> comb, int[] nums,
      int remain, int start) {
    if (remain == 0) {
      list.add(new ArrayList<>(comb));
    } else if (remain < 0) {
      return;
    } else {
      for (int i = start; i < nums.length; i++) {
        comb.add(nums[i]);
        backtrack(list, comb, nums, remain - nums[i], i);
        comb.remove(comb.size() - 1);
      }
    }
  }
}
