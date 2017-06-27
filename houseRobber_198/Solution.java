package houseRobber_198;

public class Solution {
  public int rob1(int[] nums) {
    int ln = nums.length;
    int[][] house = new int[ln + 1][2];
    for (int i = 1; i <= ln; i++) {
      house[i][0] = Math.max(house[i - 1][0], house[i - 1][1]);
      house[i][1] = house[i - 1][0] + nums[i - 1];
    }
    return Math.max(house[ln][0], house[ln][1]);
  }
  public int rob(int[] nums) {
    int ln = nums.length;
    int prevRobbed = 0;
    int prevNotRobbed = 0;
    for (int num : nums) {
      int currRobbed = prevNotRobbed + num;
      int currNotRobbed = Math.max(prevNotRobbed, prevRobbed);
      prevRobbed = currRobbed;
      prevNotRobbed = currNotRobbed;
    }
    return Math.max(prevRobbed, prevNotRobbed);
  }
}
