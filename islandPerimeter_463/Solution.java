package islandPerimeter_463;

public class Solution {
  public int islandPerimeter(int[][] grid) {
    int islands = 0;
    int neighbor = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        if (grid[row][col] == 1) {
          islands++;
          if (row < grid.length - 1 && grid[row + 1][col] == 1) {
            neighbor++;
          }
          if (col < grid[0].length - 1 && grid[row][col + 1] == 1) {
            neighbor++;
          }
        }
      }
    }
    return islands * 4 - neighbor * 2;
  }
}
