package spiralMatrixII_59;

public class Solution {
  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int rowBgn = 0;
    int rowEnd = n - 1;
    int colBgn = 0;
    int colEnd = n - 1;
    int m = 1;
    while (rowBgn <= rowEnd && colBgn <= colEnd) {
      for (int i = colBgn; i <= colEnd; i++) {
        matrix[rowBgn][i] = m;
        m++;
      }
      rowBgn++;
      for (int i = rowBgn; i <= rowEnd; i++) {
        matrix[i][colEnd] = m;
        m++;
      }
      colEnd--;
      if (rowBgn <= rowEnd) {
        for (int i = colEnd; i >= colBgn; i--) {
         matrix[rowEnd][i] = m;
         m++;
        }
      }
      rowEnd--;
      if (colBgn <= colEnd) {
        for (int i = rowEnd; i >= rowBgn; i--) {
          matrix[i][colBgn] = m;
          m++;
        }
      }
      colBgn++;
    }
    return matrix;
  }
}
