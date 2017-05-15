package firstMissingPositive_41;

import java.util.Arrays;

public class Solution {
  public int firstMissingPositive(int[] nums) {
    int index = 0;
    while (index < nums.length) {
      if (nums[index] == index + 1 || nums[index] > nums.length
          || nums[index] <= 0) {
        index++;
      } else if (nums[nums[index] - 1] != nums[index]) {
        swap(nums, index, nums[index] - 1);
      } else {
        index++;
      }
    }
    index = 0;
    while (index < nums.length && nums[index] == index + 1) {
      index++;
    }
    return index + 1;
  }
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  public static void main(String[] args){
    int[] nums = {1, 2, 0};
    int[] nums1 = {3, 4, -1, 2};
    int[] nums2 = {2, 4, -1, 8};
    int[] nums3 = {0};
    Solution sol = new Solution();
//    System.out.println(sol.firstMissingPositive(nums));
//    System.out.println(sol.firstMissingPositive(nums1));
    System.out.println(sol.firstMissingPositive(nums3));
//    System.out.println(Arrays.toString(nums));
//    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums3));
  }
}
