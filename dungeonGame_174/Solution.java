package dungeonGame_174;

public class Solution {
  public int calculateMinimumHP(int[][] dungeon) {
    if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) {
      return 0;
    }
    int rows = dungeon.length;
    int cols = dungeon[0].length;
    int[][] hp = new int[rows][cols];
    for (int i = rows - 1; i >= 0; i--) {
      for (int j = cols - 1; j >= 0; j--) {
        if (i == rows - 1 && j == cols - 1) {
          hp[i][j] = Math.max(1, 1 - dungeon[i][j]);
        } else if (i == rows - 1) {
          hp[i][j] = Math.max(1, hp[i][j + 1] - dungeon[i][j]);
        } else if (j == cols - 1) {
          hp[i][j] = Math.max(1, hp[i + 1][j] - dungeon[i][j]);
        } else {
          hp[i][j] = Math.max(1,
              Math.min(hp[i + 1][j], hp[i][j + 1]) - dungeon[i][j]);
        }
      }
    }
    return hp[0][0];
  }
}
