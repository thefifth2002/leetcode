package p374guessNumberHigherOrLower;

public class Solution {
  public int guessNumber(int n) {        int lo = 1;
    int hi = n;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int guess = guess(mid);
      if (guess == -1) {
        hi = mid - 1;
      } else if (guess == 1) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  private int guess(int mid) {
    // TODO Auto-generated method stub
    return 0;
  }
}
