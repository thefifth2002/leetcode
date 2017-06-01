package addStrings_415;

public class Solution {
  public String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int ln1 = num1.length();
    int ln2 = num2.length();
    int carry = 0;
    for (int i = ln1 - 1, j = ln2 -1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
      int sum = (i < 0 ? 0 : num1.charAt(i)- '0')
          + (j < 0 ? 0 : num2.charAt(j) - '0') + carry;
      sb.append(sum % 10);
      carry = sum / 10;
    }
    return sb.reverse().toString();
  }
}
