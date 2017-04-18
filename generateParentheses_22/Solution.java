package generateParentheses_22;

import java.util.LinkedList;
import java.util.List;

public class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> list = new LinkedList<String>();
    generator(list, "", 0, 0, n);
    return list;
  }
  public void generator(List<String> list, String parenthesis,
      int op, int cp, int count) {
    if (parenthesis.length() == count * 2) {
      list.add(parenthesis);
      return;
    }
    if (op < count) {
      generator(list, parenthesis + "(", op + 1, cp, count);
    }
    if (cp < op) {
      generator(list, parenthesis + ")", op, cp + 1, count);
    }
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.generateParenthesis(3));
  }
}
