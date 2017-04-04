package containerWithMostWater_11;

public class Solution {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int mx = 0;
    while (right > left) {
      int area = Math.min(height[left], height[right]) * (right - left);
      mx = Math.max(area, mx);
      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return mx;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] ints = {5, 3, 8, 3};
    System.out.println(sol.maxArea(ints));
  }
}
