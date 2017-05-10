package permutationsII_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
    return list;
  }

  private void backtrack(List<List<Integer>> lists, List<Integer> list,
      int[] nums, boolean[] used) {
    if (list.size() == nums.length) {
      lists.add(new ArrayList<>(list));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
          continue;
        }
        used[i] = true;
        list.add(nums[i]);
        backtrack(lists, list, nums, used);
        used[i] = false;
        list.remove(list.size() - 1);
      }
    }
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3};
    int[] nums1 = {1, 1, 2};
    int[] nums2 = {3, 3, 0, 3};
    System.out.println(sol.permuteUnique(nums2));
  }
}