package bestTimeToSellAndBuyStockIII_123;

public class Solution {
  public int maxProfit(int[] prices) {
    int fstBuy = Integer.MIN_VALUE;
    int secBuy = Integer.MIN_VALUE;
    int fstSell = 0;
    int secSell = 0;
    for (int i = 0; i < prices.length; i++) {
      fstBuy = Math.max(fstBuy, -prices[i]);
      fstSell = Math.max(fstSell, fstBuy + prices[i]);
      secBuy = Math.max(secBuy, fstSell - prices[i]);
      secSell = Math.max(secSell, secBuy + prices[i]);
    }
    return secSell;
  }
}
