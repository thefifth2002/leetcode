package nthDigit_400;

public class Solution {
  public int findNthDigit(int n) {
    long len = 1;
    long cnt = 9;
    long start = 1;
    while (n > len * cnt) {
      n -= len * cnt;
      System.out.println("n = " + n);
      len++;
      cnt *= 10;
      start *= 10;
    }
    System.out.println("start = " + start);
    start += (n - 1) / len;
    System.out.println("start = " + start);
    String s = Long.toString(start);
    return s.charAt((int) ((n - 1) % len)) - '0';
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    sol.findNthDigit(9999);
  }
}
