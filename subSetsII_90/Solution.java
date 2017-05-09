package subSetsII_90;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
  }
  private void backtrack(List<List<Integer>> list, List<Integer>sub, int[]nums,
      int start) {
    list.add(new ArrayList<>(sub));
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }
      sub.add(nums[i]);
      backtrack(list, sub, nums, i + 1);
      sub.remove(sub.size() - 1);
    }
  }
}
