package arrangingCoins_441;

public class Solution {
  public int arrangeCoins1(int n) {
    int row = 0;
    int sum = 0;
    while (sum < n) {
      if (n - sum > row) {
        row++;
        sum += row;
      } else {
        break;
      }
    }
    return row;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.arrangeCoins1(5));
  }
  public int arrangeCoins(int n) {
    int lo = 0;
    int hi = n;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
//      if (mid * (mid + 1) * 0.5 <= n) {
      if (0.5 * mid * mid + 0.5 * mid <= n) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return lo - 1;
  }
}
