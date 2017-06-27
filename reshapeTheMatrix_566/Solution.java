package reshapeTheMatrix_566;

public class Solution {
  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int rows = nums.length;
    int cols = nums[0].length;
    if (r * c != rows * cols) {
      return nums;
    }
    int [][] reshaped = new int[r][c];
    for (int i = 0; i < r * c; i++) {
      reshaped[i / c][i % c] = nums[i / cols][i % cols];
    }
    return reshaped;
  }
}
