package trappingRainWater_42;

public class Solution {
  public int trap(int[] height) {
    int water = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right && height[left] <= height[left + 1]) {
      left++;
    }
    while (left < right && height[right - 1] >= height[right]) {
      right--;
    }
    while (left < right) {
      int leftEdge = height[left];
      int rightEdge = height[right];
      if (leftEdge <= rightEdge) {
        while (left < right && leftEdge >= height[left + 1]) {
          water = water + leftEdge - height[left + 1];
          left++;
        }
        left++;
      } else {
        while (left < right && height[right - 1] <= rightEdge) {
          water = water + rightEdge - height[right - 1];
          right--;
        }
        right--;
      }
    }
    return water;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] h = {2, 0, 2};
    int[] h1 = {0,1,0,2,1,0,1,3,2,1,2,1};
//    System.out.println(sol.trap(h));
    System.out.println(sol.trap(h1));
  }
}
