package singleNumberIII_260;

public class Solution {
  public int[] singleNumber(int[] nums) {
    int[] ans = new int [2];
    int diff = 0;
    for (int n : nums) {
      diff = diff ^ n;
    }
    diff = diff & -diff;
    for (int n : nums) {
      if((n & diff) == 0) {
        ans[0] = ans[0] ^ n;
      } else {
        ans[1] = ans[1] ^ n;
      }
    }
    return ans;
  }
}
