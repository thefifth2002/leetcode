package totalHammingDistance_477;

public class Solution {
  /*
   * LTE with brutal force method
   */
  public int totalHammingDistance1(int[] nums) {
    int distance = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++){
        if (nums[i] != nums[j]) {
          distance += Integer.bitCount(nums[i] ^ nums[j]);
        }
      }
    }
    return distance;
  }

  public int totalHammingDistance(int[] nums) {
    int distance = 0;
    int[] ones = new int[31];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < 31; j++) {
        ones[j] += nums[i] >> j & 1;
      }
    }
/*
conculate how many ones and how many zeros at each bit from nums.
get product cnt of ones * cnt of zeros,
*/
    for (int cnt : ones) {
      distance += cnt * (nums.length - cnt);
    }
    return distance;
  }
}
