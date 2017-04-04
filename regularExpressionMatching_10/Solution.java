package regularExpressionMatching_10;

public class Solution {
  public boolean isMatch(String s, String p) {
    if ( s == null || p == null) {
      return false;
    }
    boolean m[][] = new boolean [s.length() + 1][p.length() + 1];
    m[0][0] = true;

    //i = 0, so the first row, s = "", p =  a*b*... but this can be empty
    for (int i = 0; i < p.length(); i++) {
      if (p.charAt(i) == '*' && m[0][i-1]) {
        m[0][i + 1] = true;
      }
    }
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < p.length(); j++) {
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
          m[i + 1][j + 1] = m[i][j];
        }
        if (p.charAt(j) == '*') {
          //p[j-1]* consider as empty
          if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j-1) != '.') {
            m[i + 1][j + 1] = m[i + 1][j - 1];
          } else {
            //p[j-1]* is single m[i + 1][j]
            //p[j-1]* is empty m[i + 1][j - 1], go back 2 means p[j-1]* is nothing
            //p[j-1]* is multiple, s go back 1, p go on; go up one row.
            m[i + 1][j + 1] = m[i + 1][j] || m[i + 1][j - 1] || m[i][j + 1];
          }
        }
      }
    }
    return m[s.length()][p.length()];
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.isMatch("aa", "a.a"));
  }
}
