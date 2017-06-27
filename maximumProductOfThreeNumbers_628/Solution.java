package maximumProductOfThreeNumbers_628;

import java.util.Arrays;

public class Solution {
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int ln = nums.length;
    return Math.max(nums[ln - 1] * nums[ln - 2] * nums[ln - 3],
        nums[0] * nums[1] * nums[ln - 1]);
  }
}
