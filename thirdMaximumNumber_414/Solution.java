package thirdMaximumNumber_414;

public class Solution {
  public int thirdMax(int[] nums) {
    long min = Long.MIN_VALUE;
    long trd = min;
    long sec = min;
    long fst = min;

    for (int num : nums) {
      if (num == trd || num == sec || num == fst) {
        continue;
      } else if (fst == min || num > fst) {
        trd = sec;
        sec = fst;
        fst = num;
      } else if (sec == min || num > sec) {
        trd = sec;
        sec = num;
      } else if (trd == min || num > trd) {
        trd = num;
      }
    }
    return (int)(trd == min ? fst : trd);
  }
}
