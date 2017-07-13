package validPerfectSquare_367;

public class Solution {
  public boolean isPerfectSquare(int num) {
    int root = squreRoot(num);
    return root * root == num;
  }
  public int squreRoot(int num) {
    int lo = 1;
    int hi = num;
    while (true) {
      int mid = lo + (hi - lo) / 2;
      if (mid < num / mid) {
        lo = mid + 1;
      } else {
        if (mid - 1 < num / (mid - 1)) {
          return mid;
        }
        hi = mid - 1;
      }
    }
  }
}
