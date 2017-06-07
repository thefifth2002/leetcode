package teemoAttack_495;

public class Solution {
  public int findPoisonedDuration(int[] timeSeries, int duration) {
    if (timeSeries.length == 0) {
      return 0;
    }
    int poi = 0;
    for (int i = 1; i < timeSeries.length; i++) {
      poi += timeSeries[i] - timeSeries[i - 1] >= duration ?
          duration : timeSeries[i] - timeSeries[i - 1];
    }
    return poi + duration;
  }
  public static void main(String[] args) {
    int[] ts = {1, 5, 6, 8};
    Solution sol = new Solution();
    System.out.println(sol.findPoisonedDuration(ts, 4));
  }
}
