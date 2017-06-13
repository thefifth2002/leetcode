package wordSearchII_212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<String> findWords(char[][] board, String[] words) {
    List<String> list = new ArrayList<>();
    Node root = build(words);
    int rows = board.length;
    int cols = board[0].length;
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        search(board, row, col, root, list);
      }
    }
    return list;
  }
  private void search(char[][] board, int row, int col,
      Node root, List<String> list) {
    char c = board[row][col];
    if (c == ' ' || root.children[c - 'a'] == null) {
      return;
    }
    root = root.children[c - 'a'];
    if (root.word != null) {
      list.add(root.word);
      root.word = null;
    }
    board[row][col] = ' ';
    if (row > 0) {
      search(board, row - 1, col, root, list);
    }
    if (col > 0) {
      search(board, row, col - 1, root, list);
    }
    if (row < board.length - 1) {
      search(board, row + 1, col, root, list);
    }
    if (col < board[0].length - 1) {
      search(board, row, col + 1, root, list);
    }
    board[row][col] = c;
  }
  public Node build(String[] words) {
    Node root = new Node();
    for (String w : words) {
      Node r = root;
      for (char c : w.toCharArray()) {
        if (r.children[c - 'a'] == null) {
          r.children[c - 'a'] = new Node();
        }
        r = r.children[c - 'a'];
      }
      r.word = w;
    }
    return root;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    char[][] board = {{'o','a','a','n'},{'e','t','a','e'},
        {'i','h','k','r'},{'i','f','l','v'}};
    String[] words = {"oath", "pea", "eat", "rain"};
    List<String> list = sol.findWords(board, words);
    System.out.println(Arrays.toString(list.toArray()));
  }
}
