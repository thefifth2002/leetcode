package excelSheetColumnTitle_168;

public class Solution {
  public String convertToTitle(int n) {
    StringBuilder sb = new StringBuilder();
    while (n > 0) {
      n--;
      char c = (char) (n % 26 + 'A');
      sb.insert(0, c);
      n /= 26;
    }
    return sb.toString();
  }
}
