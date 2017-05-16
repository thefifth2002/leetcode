package missingNumber_268;

import java.util.Arrays;

public class Solution {
  public int missingNumber(int[] nums) {
    // linear search, too slow
    Arrays.sort(nums);
    if (nums[0] != 0) {
      return nums[0] - 1;
    }
    int i = 0;
    while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
      i++;
    }
    return nums[i] + 1;
  }
  public int missingNumber2(int[] nums) {
    Arrays.sort(nums);
    int lo = 0;
    int hi = nums.length;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] > mid) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }
    return lo;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {0, 1, 3};
    int[] nums1 = {1};
    int[] nums2 = {0, 1, 2, 3, 5};
    int[] nums3 = {1, 2};
    System.out.println(sol.missingNumber(nums));
    System.out.println(sol.missingNumber(nums1));
    System.out.println(sol.missingNumber(nums2));
    System.out.println(sol.missingNumber(nums3));
  }
}
