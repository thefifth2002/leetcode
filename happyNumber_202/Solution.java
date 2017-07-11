package happyNumber_202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean isHappy(int n) {
    Set<Integer> Sums = new HashSet<>();
    while (Sums.add(n)) {
      int sum = 0;
      while (n > 0) {
        int tmp = n % 10;
        sum += tmp * tmp;
        n /= 10;
      }
      if (sum == 1) {
        return true;
      } else {
        n = sum;
      }
    }
    return false;
  }
}
