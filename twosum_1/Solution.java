package twosum_1;

import java.util.HashMap;

/*
 * two pointer navie method O(n^2)
 * with two pinter scan through the list to check if two number added to target
 */
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
 
  /*
   * linear method using hashmap
   * use hash map to store the number as key, the index of number as value
   * diff = target - nums[i], so as scan through the array nums, we can check if 
   * the difference is already met before, if not, store it in the hashmap.
   * if met, pull out the number's index
   */
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