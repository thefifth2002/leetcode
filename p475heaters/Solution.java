package p475heaters;

import java.util.Arrays;

public class Solution {
  public int findRadius(int[] houses, int[] heaters) {
    Arrays.sort(houses);
    Arrays.sort(heaters);
    int i = 0;
    int res = 0;
    for (int house : houses) {
      while (i < heaters.length - 1 && Math.abs(heaters[i] - house)
          >= Math.abs(heaters[i + 1] - house)) {
        i++;
      }
      res = Math.max(res, Math.abs(heaters[i] - house));
    }
    return res;
  }
  public int findRadius2(int[] houses, int[] heaters) {
    int res = Integer.MIN_VALUE;
    Arrays.sort(heaters);
    for (int house : houses) {
      int index = Arrays.binarySearch(heaters, house);
      if (index < 0 ) {
        index = -(index + 1);
      }
      int left = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
      int right = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
      res = Math.max(res, Math.min(left, right));
    }
    return res;
  }
}
