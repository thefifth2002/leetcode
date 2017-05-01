package nextPermutation_31;

import java.util.Arrays;

public class Solution {
  public void nextPermutation(int[] nums) {
    if (nums.length < 2) {
      return;
    }
    int i = nums.length - 1;
    while (i > 0) {
      if (nums[i -1] < nums[i]) {
        break;
      }
      i--;
    }
    if (i == 0) {
      reverse(nums, 0, nums.length - 1);
      return;
    } else {
      int j = nums.length - 1;
      while (j >= i) {
        if (nums[j] > nums[i - 1]) {
          break;
        }
        j--;
      }
      swap(nums, i - 1, j);
      reverse(nums, i, nums.length - 1);
      return;
    }
  }
  public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  public void reverse(int[] nums, int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
    return;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
//    int[] nums = {1, 1};
    int[] ints = {6, 8, 7, 4, 3, 2};
//    sol.nextPermutation(nums);
    sol.nextPermutation(ints);
    System.out.println(Arrays.toString(ints));
//    System.out.println(ints);
  }
}
