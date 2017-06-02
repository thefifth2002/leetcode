package addBinary_67;

public class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int ln1 = a.length();
    int ln2 = b.length();
    int carry = 0;
    for (int i = ln1 - 1, j = ln2 - 1; i >= 0 || j >= 0 || carry ==1; i--, j--) {
      int sum = (i < 0 ? 0 : a.charAt(i)- '0')
          + (j < 0 ? 0 : b.charAt(j) - '0') + carry;
      sb.append(sum % 2);
      carry = sum / 2;
    }
    return sb.reverse().toString();
  }
  public static void main (String[] args) {
    Solution sol = new Solution();

  }
}
