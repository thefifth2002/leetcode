package reverseVowelsOfAString_345;

public class Solution {
  public String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    char[] chars = s.toCharArray();
    int ln = chars.length;
    int start = 0;
    int end = ln - 1;
    while (start < end) {
      while (start < end && !vowels.contains(chars[start] + "")) {
        start++;
      }
      while (start < end && !vowels.contains(chars[end] + "")) {
        end--;
      }
      swap(chars, start, end);
      start++;
      end--;
    }
    return new String(chars);
  }
  private void swap(char[] chars, int i, int j) {
    char tmp = chars[i];
    chars[i] = chars[j];
    chars[j] = tmp;
  }
}
