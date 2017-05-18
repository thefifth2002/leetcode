package findTheDuplicateNumber_287;

public class Solution {
  public int findDuplicate(int[] nums) {
    int lo = 1;
    int hi = nums.length - 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int cnt = 0;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] <= mid) {
          cnt++;
        }
      }
      if (cnt <= mid) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  }
}
