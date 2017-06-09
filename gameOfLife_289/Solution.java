package gameOfLife_289;

public class Solution {
  public void gameOfLife(int[][] board) {
    if(board == null || board.length == 0) {
      return;
    }
    int rows = board.length;
    int cols = board[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int lives = getLives(board, i, j);
        if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
          board[i][j] = 3;
        }
        if (board[i][j] == 0 && lives == 3) {
          board[i][j] = 2;
        }
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j] >>= 1;
      }
    }
  }

  private int getLives(int[][] board, int i, int j) {
    int rows = board.length;
    int cols = board[0].length;
    int lives = 0;
    for (int x = Math.max(i - 1, 0); i <= Math.min(i + 1, rows - 1); i++) {
      for (int y = Math.max(j - 1, 0); j <= Math.min(j + 1, cols - 1); j++) {
        lives += board[x][y] & 1;
      }
    }
    lives -= board[i][j] & 1;
    return lives;
  }
}
