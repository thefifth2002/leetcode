package uniquePathsII_63;

public class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int row = obstacleGrid.length;
    int col = obstacleGrid[0].length;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (obstacleGrid[i][j] == 1) {
          obstacleGrid[i][j] = 0;
        } else if (i == 0 & j == 0) {
          obstacleGrid[i][j] = 1;
        } else if (i == 0) {
          obstacleGrid[i][j] = obstacleGrid[i][j - 1] * 1;
        } else if (j == 0) {
          obstacleGrid[i][j] = obstacleGrid[i - 1][j] * 1;
        } else {
          obstacleGrid[i][j] = obstacleGrid[i - 1][j]
            + obstacleGrid[i][j - 1];
        }
      }
    }
    return obstacleGrid[row - 1][col - 1];
  }
}
/*
 * Say for example, you are looking at an element in the first row
 * (row 0), and there's an obstacle in the second column (col 1),
 * because for elements in the first row, the only possible path
 * from (0,0) is to keep going right, (0, 1), (0, 2) ...
 * Any obstacles in the way will block this path for all elements
 * to the right of it.
 * Now let's look at how this logic is implemented in code. If there
 * is an obstacle in the first row (i == 0), the first if statement,
 * if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0; will turn this
 * element into 0. Any elements to its right (with larger j values)
 * will be turned into 0 by the third statement
 * obstacleGrid[i][j] = obstacleGrid[i][j - 1] * 1,
 * meaning we cannot get to (i,j) from (0,0). Well of course that's
 * the case, because the only path to (i,j) is blocked by the obstacle
 * in first row.
 */
