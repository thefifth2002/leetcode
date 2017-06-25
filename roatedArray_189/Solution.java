package roatedArray_189;

import java.util.Arrays;

public class Solution {
  /*
   * lte
   */
  public void rotate1(int[] nums, int k) {
    int ln = nums.length;
    k = k % ln;
    for (int i = 0; i < k; i++) {
      for (int j = ln - 1; j > 0; j--) {
        swap(nums, j, j - 1);
      }
    }
  }
  public void rotate(int[] nums, int k) {
    int ln = nums.length;
    k = k % ln;
    for (int i = 0; i < ln / 2; i++) {
      swap(nums, i, ln - 1 - i);
    }
    System.out.println(Arrays.toString(nums));
    for (int i = 0; i < k / 2; i++) {
      swap(nums, i, k - 1 - i);
    }
    System.out.println(Arrays.toString(nums));
    for (int i = 0; i < (ln - k) / 2; i++) {
      swap(nums, k + i, ln - 1 - i);
    }
    System.out.println(Arrays.toString(nums));
  }
  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3};
    int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
    sol.rotate(nums1, 3);
  }
}
