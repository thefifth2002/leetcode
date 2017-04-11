package letterCombinationOfAPhoneNumber_17;

import java.util.LinkedList;
import java.util.List;

public class Solution {
  public List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
      return null;
    }
    LinkedList<String> list = new LinkedList<String>();
    String[] symbols = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    list.add("");
    for (int i = 0; i < digits.length(); i++) {
      int n = Character.getNumericValue(digits.charAt(i));
      while (list.peek().length() == i) {
        String temp = list.remove();
        for (int j = 0; j < symbols[n].length(); j++) {
          list.add(temp + symbols[n].charAt(j));
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.letterCombinations("23"));
  }
}
