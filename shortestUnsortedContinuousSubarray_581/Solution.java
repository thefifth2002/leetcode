package shortestUnsortedContinuousSubarray_581;

public class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int ln = nums.length;
    int start = -1;
    int end = -2;
    int min = nums[ln - 1];
    int max = nums[0];
    for (int i = 0; i < ln; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[ln - 1 - i]);
      System.out.println("i = " + i);
      System.out.println("max = " + max);
      System.out.println("min = " + min);
      if (nums[i] < max) {
        end = i;
        System.out.println("end = " + end);
      }
      if (nums[ln - 1 - i] > min) {
        start = ln - 1 - i;
        System.out.println("start = " + start);
      }
    }
    return end - start + 1;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {2, 6, 4, 8, 10, 9, 15};
    sol.findUnsortedSubarray(nums);
  }
}
