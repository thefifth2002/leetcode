package combinationSumII_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> list = new ArrayList<>();
    backtrack(list, new ArrayList<>(), candidates, target, 0);
    return list;
  }
  private void backtrack(List<List<Integer>> list, List<Integer> comb, int[] nums,
      int remain, int start) {
    if (remain == 0) {
      list.add(new ArrayList<>(comb));
    } else if (remain < 0) {
      return;
    } else {
      for (int i = start; i < nums.length; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
          continue;
        }
        comb.add(nums[i]);
        backtrack(list, comb, nums, remain - nums[i], i + 1);
        comb.remove(comb.size() - 1);
      }
    }
  }
}
