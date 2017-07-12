package perfectNumber_507;

public class Solution {
  /**
   * TLE
   * @param num
   * @return
   */
  public boolean checkPerfectNumber(int num) {
    if (num == 1) {
      return false;
    }
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if ( num % i == 0) {
        System.out.println(i);
        sum += i;
        if (i != num / i) {
          sum += num / i;
        }
      }
    }
    return sum == num;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    sol.checkPerfectNumber(28);
  }
}
