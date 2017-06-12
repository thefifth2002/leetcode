package wordSearch_79;

public class Solution {
  public boolean exist(char[][] board, String word) {
    char[] w = word.toCharArray();
    int rows = board.length;
    int cols = board[0].length;
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        if (exist(board, i, j, w, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean exist(char[][] board, int row, int col,
      char[] word, int id) {
    int rows = board.length;
    int cols = board[0].length;
    if (id == word.length) {
      return true;
    } if (row < 0 || col < 0 || row == rows || col == cols
        || board[row][col] != word[id]) {
      return false;
    }
    board[row][col] = ' ';
    boolean is = exist(board, row, col - 1, word, id + 1)
        || exist(board, row, col + 1, word, id + 1)
        || exist(board, row + 1, col, word, id + 1)
        || exist(board, row - 1, col, word, id + 1);
    board[row][col] = word[id];
    return is;
  }
}
