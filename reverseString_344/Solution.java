package reverseString_344;

public class Solution {
  public String reverseString(String s) {
    char[] chars = s.toCharArray();
    int ln = chars.length;
    for (int i = 0; i < ln / 2; i++) {
      swap(chars, i, ln - 1 - i);
    }
    return new String(chars);
  }

  private void swap(char[] chars, int i, int j) {
    char tmp = chars[i];
    chars[i] = chars[j];
    chars[j] = tmp;
  }
}
