package threeSumCloset_16;

import java.util.Arrays;

public class Solution {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int res = 0;
    int diff = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length-2; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum < target) {
          left++;
        } else {
          right--;
        }
        diff = Math.min(diff, Math.abs(sum - target));
        if (Math.min(diff, Math.abs(sum - target)) == Math.abs(sum - target)) {
          res = sum;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] s = {-1, 2, 1, -4};
    int[] s1 = {1, 1, 1, 0};
//    System.out.println(sol.threeSumClosest(s, 1));
    System.out.println(sol.threeSumClosest(s1, -100));
  }
}
