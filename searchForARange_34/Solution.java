package searchForARange_34;

public class Solution {
  public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = searchStart(nums, target);
    result[1] = searchEnd(nums, target);

    return result;
  }
  private int searchStart(int[] nums, int target) {
    int start = -1;
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (target <= nums[mid]) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
      if (nums[mid] == target) {
        start = mid;
      }
    }
    return start;
  }
  private int searchEnd(int[] nums, int target) {
    int end = -1;
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (target >= nums[mid]) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
      if (nums[mid] == target) {
        end = mid;
      }
    }
    return end;
  }
}
