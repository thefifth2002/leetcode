package sortColors_75;

import java.util.Arrays;

public class Solution {
  public void sortColors(int[] nums) {
    int zeroes = 0;
    int twoes = nums.length - 1;
    for (int i = 0; i <= twoes; i++) {
      if (nums[i] == 0) {
        swap(nums, i, zeroes);
        zeroes++;
      } else if (nums[i] == 2) {
        swap(nums, i, twoes);
        twoes--;
        i--;
      }
    }
  }
  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 0};
    sol.sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }
}
