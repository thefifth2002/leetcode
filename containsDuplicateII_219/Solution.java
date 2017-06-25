package containsDuplicateII_219;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  /*
   * lte
   */
  public boolean containsNearbyDuplicate1(int[] nums, int k) {
    if (nums == null || k == 0) {
      return false;
    }
    for (int i = 0; i < nums.length; i++) {
      int j = 1;
      while (i + j < nums.length && j <= k) {
        if (nums[i] == nums[i + j]) {
          return true;
        }
        j++;
      }
    }
    return false;
  }
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (i > k) {
        set.remove(nums[i - k - 1]);
      }
      if (!set.add(nums[i])) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums1 = {-1, -1};
    int[] nums2 = {99, 99};
    System.out.println(sol.containsNearbyDuplicate(nums1, 1));
    System.out.println(sol.containsNearbyDuplicate(nums2, 2));
  }

}
