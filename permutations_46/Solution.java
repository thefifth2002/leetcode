package permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> lists = new ArrayList<>();
    backtrack(lists, new ArrayList<>(), nums);
    return lists;
  }
  private void backtrack(List<List<Integer>> lists, List<Integer> list,
      int[] nums) {
    if (list.size() == nums.length) {
      lists.add(new ArrayList<>(list));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (list.contains(nums[i])) {
          continue;
        }
        list.add(nums[i]);
        backtrack(lists, list, nums);
        list.remove(list.size() - 1);
      }
    }
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3};
    System.out.println(sol.permute(nums));
  }
}
