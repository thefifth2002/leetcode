package minimumPathSum_64;

public class Solution {
  public int minPathSum(int[][] grid) {
    int min = 0;
    int rows = grid.length;
    int cols = grid[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i == 0 & j == 0) {
          grid[i][j] = grid[i][j];
        } else if (i == 0 && j != 0) {
          grid[i][j] += grid[i][j - 1];
        } else if (i != 0 && j == 0) {
          grid[i][j] += grid[i - 1][j];
        } else {
          grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
        }
      }
    }
    return grid[rows - 1][cols - 1];
  }
}
