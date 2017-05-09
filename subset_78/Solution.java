package subset_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
  }
  private void backtrack(List<List<Integer>> list, List<Integer>sub, int[]nums,
      int start) {
    list.add(new ArrayList<>(sub));
    for (int i = start; i < nums.length; i++) {
      sub.add(nums[i]);
      backtrack(list, sub, nums, i + 1);
      sub.remove(sub.size() - 1);
    }
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3};
    System.out.println(sol.subsets(nums));
  }
}
