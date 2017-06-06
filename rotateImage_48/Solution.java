package rotateImage_48;

public class Solution {
  public void rotate(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    for (int i = 0; i < row; i++) {
      for (int j = i; j < col; j++) {
       int tmp = matrix[i][j];
       matrix[i][j] = matrix[j][i];
       matrix[j][i] = tmp;
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < row / 2; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][row - j - 1];
        matrix[i][row - j - 1] = tmp;
      }
    }
  }
}
