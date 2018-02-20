package p278firstBadVersion;

public class Solution {
  public int firstBadVersion(int n) {
    int lo = 1;
    int hi = n;
    while (lo <= n) {
      int mid = lo + (hi - lo) / 2;
      if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
        return mid;
      } else if (isBadVersion(mid) == true && isBadVersion(mid - 1) == true) {
        hi = mid - 1;
      } else if (isBadVersion(mid) == false && isBadVersion(mid - 1) == false) {
        lo = mid + 1;
      }
    }
    return -1;
  }

  private boolean isBadVersion(int mid) {
    // TODO Auto-generated method stub
    return false;
  }
}
