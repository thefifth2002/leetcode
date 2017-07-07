package reverseStringII_541;

public class Solution {
  public String reverseStr(String s, int k) {
    char[] arr = s.toCharArray();
    int ln = arr.length;
    int i = 0;
    while (i < ln) {
      partialReverse(arr, i, Math.min(i + k - 1, ln - 1));
      i += k * 2;
    }
    return String.valueOf(arr);
  }
  private void partialReverse(char[] arr, int i, int j) {
    while (i < j) {
      char tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      i++;
      j--;
    }
  }
}
