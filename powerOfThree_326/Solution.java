package powerOfThree_326;

public class Solution {
  public boolean isPowerOfThree1(int n) {
    if (n > 1) {
      while (n % 3 == 0) {
        n /= 3;
      }
    }
    return n == 1;
  }
  public boolean isPowerOfThree2(int n) {
    return n > 0 && (n == 1 || isPowerOfThree2(n / 3));
  }
  public boolean isPowerOfThree(int n) {
    return n > 0 && 1162261467 % n == 0;
  }
}
