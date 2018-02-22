package p496nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      boolean selfFound = false;
      boolean greaterFound = false;
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          selfFound = true;
          continue;
        }
        if (selfFound && nums2[j] > nums1[i]) {
          res[i] = nums2[j];
          greaterFound = true;
          break;
        }
      }
      if (!greaterFound) {
        res[i] = -1;
      }
    }
    return res;
  }
  public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums2) {
      while (!stack.isEmpty() && stack.peek() < num) {
        map.put(stack.pop(), num);
      }
      stack.push(num);
    }
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = map.getOrDefault(nums1[i], -1);
    }
    return nums1;
  }
}
