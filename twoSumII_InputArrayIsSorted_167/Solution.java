package twoSumII_InputArrayIsSorted_167;

public class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int lo = 0;
    int hi = numbers.length - 1;
    while (lo < hi) {
      int sum = numbers[lo] + numbers[hi];
      if ( sum == target) {
        return new int[] {lo + 1, hi + 1};
      } else if (sum < target) {
        lo++;
      } else {
        hi--;
      }
    }
    return new int[2];
  }
}
