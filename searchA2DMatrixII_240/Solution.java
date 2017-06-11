package searchA2DMatrixII_240;

public class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0
        || matrix[0].length == 0) {
      return false;
    }
    int rows = 0;
    int cols = matrix[0].length - 1;
    while (cols >= 0 && rows <= matrix.length - 1) {
      if (matrix[rows][cols] == target) {
        return true;
      } else if (matrix[rows][cols] < target) {
        rows++;
      } else {
        cols--;
      }
    }
    return false;
  }
}
