package singleNumberII_137;

public class Solution {
  public int singleNumber(int[] nums) {
    int a = 0;
    int b = 0;
    for (int n: nums) {
      int tmpA = a & ~b & ~n | ~a & b & n;
      b = ~a & b & ~n | ~a & ~b & n;
      a = tmpA;
    }
    return a | b;
  }
}
