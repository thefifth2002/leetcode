package jumpGameII_45;

public class Solution {
  public int jump(int[] nums) {
    int lev = 0;
    int curMax = 0;
    int nxtMax = 0;
    int i = 0;
    if(nums.length < 2) {
      return 0;
    }
    while (i <= curMax) {
      lev++;
      while (i <= curMax) {
        nxtMax = Math.max(nxtMax, nums[i] + i);
        if (nxtMax >= nums.length - 1) {
          return lev;
        }
        i++;
      }
      curMax = nxtMax;
    }
    return 0;
  }
  public static void main(String[] args) {
    int[] num = {0};
    Solution sol = new Solution();
    System.out.println(sol.jump(num));
  }
}
