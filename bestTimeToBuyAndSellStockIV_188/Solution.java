package bestTimeToBuyAndSellStockIV_188;

public class Solution {
  public int maxProfit(int k, int[] prices) {
    int ln = prices.length;
    int profit = 0;
    if (k >= ln / 2) {
      for (int i = 0; i < ln - 1; i++) {
        if (prices[i + 1] > prices[i]) {
          profit += prices[i + 1] - prices[i];
        }
      }
      return profit;
    }
    int [][] matrix = new int[k + 1][ln];
    for (int i = 1; i <= k; i++) {
      int tmp = -prices[0];
      for (int j = 1; j < ln; j++) {
        matrix[i][j] = Math.max(matrix[i][j - 1], tmp + prices[j]);
        tmp = Math.max(tmp, matrix[i - 1][j - 1] - prices[j]);
      }
    }
    return matrix[k][ln - 1];
  }
}
