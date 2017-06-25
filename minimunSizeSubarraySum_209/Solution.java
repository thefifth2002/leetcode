package minimunSizeSubarraySum_209;

public class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    int start = 0;
    int end = 0;
    while (end < nums.length) {
      sum += nums[end];
      end++;
      while (sum >= s) {
        min = Math.min(min, end - start);
        sum -= nums[start];
        start++;
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
