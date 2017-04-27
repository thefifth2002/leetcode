package divideTwoIntegers_29;

public class Solution {
  public int divide(int dividend, int divisor) {
    int sign = 1;
    if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
      sign = -1;
    }
    if (divisor == 0) {
      return Integer.MAX_VALUE;
    }
    long ldividend = Math.abs((long) dividend);
    long ldivisor = Math.abs((long) divisor);
    if (ldividend == 0 || ldividend < ldivisor) {
      return 0;
    }

    long res = helper(ldividend, ldivisor);
    if (res > Integer.MAX_VALUE) {
      if (sign > 0) {
        res =  Integer.MAX_VALUE;
      } else {
        res = Integer.MIN_VALUE;
      }
    } else {
      res = (int) (res * sign);
    }
    return (int) res;
  }

  private long helper(long ldividend, long ldivisor) {
    if (ldividend < ldivisor) {
      return 0;
    }
    long sum = ldivisor;
    long counter = 1;
    while (sum < ldividend - sum) {
      sum = sum + sum;
      counter = counter + counter;
    }
    return counter + helper(ldividend - sum, ldivisor);
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.divide(11, 6));
    System.out.println(sol.divide(10, 3));
    System.out.println(sol.divide(-1, 1));
    System.out.println(sol.divide(-2147483648, -1));
  }
}
