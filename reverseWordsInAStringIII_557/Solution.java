package reverseWordsInAStringIII_557;

public class Solution {
  public String reverseWords(String s) {
    char[] arr = s.toCharArray();
    int start = 0;
    int end = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ' ') {
        end = i - 1;
        reverse(arr, start, end);
        start = i + 1;
      }
      if (i == arr.length - 1) {
        reverse(arr, start, arr.length - 1);
      }
    }
    return String.valueOf(arr);
  }
  private void reverse(char[] arr, int start, int end) {
    while (start < end) {
      char tmp = arr[start];
      arr[start] = arr[end];
      arr[end] = tmp;
      start++;
      end--;
    }
  }
}
