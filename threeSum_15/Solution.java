package threeSum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for (int i = 0; i < nums.length-2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          List<Integer> innerList = Arrays.asList(nums[i], nums[left], nums[right]);
          System.out.println(innerList.toString());
          list.add(innerList);
          left++;
          right--;
          while (left < right && nums[left] == nums[left -1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int[] nums1 = {-2, 0, 1, 1, 2};
    int[] nums2 = {-1,0,1,2,-1,-4};
    System.out.println(sol.threeSum(nums1).toString());
    System.out.println(sol.threeSum(nums2).toString());
  }
}
