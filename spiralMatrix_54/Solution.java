package spiralMatrix_54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list = new ArrayList<>();
    if (matrix.length == 0) {
      return list;
    }
    int rowBgn = 0;
    int rowEnd = matrix.length - 1;
    int colBgn = 0;
    int colEnd = matrix[0].length - 1;
    while (rowBgn <= rowEnd && colBgn <= colEnd) {
      for (int i = colBgn; i <= colEnd; i++) {
        list.add(matrix[rowBgn][i]);
      }
      rowBgn++;
      for (int i = rowBgn; i <= rowEnd; i++) {
        list.add(matrix[i][colEnd]);
      }
      colEnd--;
      if (rowBgn <= rowEnd) {
        for (int i = colEnd; i >= colBgn; i--) {
          list.add(matrix[rowEnd][i]);
        }
      }
      rowEnd--;
      if (colBgn <= colEnd) {
        for (int i = rowEnd; i >= rowBgn; i--) {
          list.add(matrix[i][colBgn]);
        }
      }
      colBgn++;
    }
    return list;
  }
}
