package search2DMatrix_74;

public class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix[0] == null) {
      return false;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    int lo = 0;
    int hi = rows * cols - 1;
    while (lo <= hi) {
      int mid = lo + (lo + hi) / 2;
      int val = matrix[mid / cols][mid % cols];
      if (val == target) {
        return true;
      } else if (val < target) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return false;
  }
}
