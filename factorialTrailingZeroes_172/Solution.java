package factorialTrailingZeroes_172;

public class Solution {
  public int trailingZeroes(int n) {
    int cnt = 0;
    while (n > 0) {
      cnt += n / 5;
      n /= 5;
    }
    return cnt;
  }
  public int trailingZeroes1(int n) {
    return n == 0 ? 0 : n / 5 + trailingZeroes1(n / 5);
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.trailingZeroes(0));
  }
}
