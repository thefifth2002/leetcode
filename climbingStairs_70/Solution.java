package climbingStairs_70;

public class Solution {
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int ways = 0;
    int prevOne = 2;
    int prevTwo = 1;
    for (int i = 2; i < n; i++) {
      ways = prevOne + prevTwo;
      prevTwo = prevOne;
      prevOne = ways;
    }
    return ways;
  }
}
