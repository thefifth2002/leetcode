package fourSum_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target){
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int left = j + 1;
        int right = nums.length - 1;
        while (left < right) {
          int sum = nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target) {
            List<Integer> quadruplets =
                Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
            list.add(quadruplets);
            left++;
            right--;
            while (left < right && nums[left] == nums[left -1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right + 1]) {
              right--;
            }
          } else if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 0, -1, 0, -2, 2};
    int[] nums1 = {0, 0, 0, 0};
    int[] nums2 = {-1,0,1,2,-1,-4};
    System.out.println(sol.fourSum(nums1, 0).toString());
  }
}
