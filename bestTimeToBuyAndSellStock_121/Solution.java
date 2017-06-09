package bestTimeToBuyAndSellStock_121;

public class Solution {
  /*/
   * TLE
   */
  public int maxProfit1(int[] prices) {
    int max = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        max = Math.max(max, prices[j] - prices[i]);
      }
    }
    return max;
  }
  public int maxProfit(int[] prices) {
    int curMax = 0;
    int max = 0;
    for (int i = 1; i < prices.length; i++) {
      curMax = Math.max(0, curMax += prices[i] - prices[i - 1]);
      max = Math.max(max, curMax);
    }
    return max;
  }
}
