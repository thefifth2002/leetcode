package twosum_1;

import java.util.HashMap;

public class Solution {
  public int[] twoSum1(int[] nums, int target) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (nums[i] + nums [j] == target) {
          int [] result = {i, j};
          return result;
        }
      }
    }
    return null;
  }
  
  public static void main (String [] args){
    Solution sol = new Solution();
    int [] nums = {2, 7, 11, 15};
    int target = 9;
    int [] results = new int [2];
    results = sol.twoSum(nums, target);
    for (int result: results) {
        System.out.println(result);
    }
  }
  
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)){
        int [] res = {map.get(diff), i};
        return res;
      }
      map.put(nums[i], i);
    }
    return null;
  }
}