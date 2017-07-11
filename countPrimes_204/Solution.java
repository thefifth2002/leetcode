package countPrimes_204;

public class Solution {
  /**
   * TLE
   * @param n
   * @return
   */
  public int countPrimes1(int n) {
    int cnt = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        cnt++;
      }
    }
    return cnt;
  }

  private boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public int countPrimes(int n) {
    boolean[] primeOrNot = new boolean[n];
    int cnt = 0;
    for (int i = 2; i < n; i++) {
      if (!primeOrNot[i]) {
        cnt++;
        for (int j = 2; i * j < n; j++) {
          primeOrNot[i * j] = true;
        }
      }
    }
    return cnt;
  }
}
