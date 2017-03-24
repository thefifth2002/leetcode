package zigZagConversion_5;

public class Solution {
  public static String convert(String s, int numRows) {
    if (numRows == 0) {
      return "";
    } else if (numRows == 1) {
      return s;
    }
    String result = "";
    StringBuilder [] strings = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      strings[i] = new StringBuilder();
    }
    boolean reverse = false;
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
      if(j == 0) {
        reverse = false;
      }
      if(j == numRows - 1) {
        reverse = true;
      }
      strings[j].append(s.charAt(i));
      if(reverse) {
        j--;
      }
      else {
        j++;
      }
    }
    for (int k = 0; k < numRows; k++) {
      result += strings[k];
    }
    return result;
  }

  public static void main(String[] args) {
    String s = "ab";
    String s1 = convert(s, 1);
    System.out.println(s1);
  }
}
