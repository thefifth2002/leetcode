package majorityElement_169;

public class Solution {
  public int majorityElement(int[] nums) {
    int major = nums[0];
    int cnt = 1;
    for (int i = 1; i < nums.length; i++) {
      if (cnt == 0) {
        major = nums[i];
        cnt = 1;
      } else if (major == nums[i]) {
        cnt++;
      } else {
        cnt--;
      }
    }
    return major;
  }
}
