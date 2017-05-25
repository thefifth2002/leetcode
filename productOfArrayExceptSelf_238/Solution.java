package productOfArrayExceptSelf_238;

import java.util.Arrays;

public class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0, tmp = 1; i < nums.length; i++) {
        result[i] = tmp;
        tmp = tmp * nums[i];
    }
    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
        result[i] = result[i] * tmp;
        tmp = tmp * nums[i];
    }
    return result;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int [] nums = {1, 2, 3, 4};
    int [] newNums = sol.productExceptSelf(nums);
    System.out.println(Arrays.toString(newNums));
  }
}
