package repeatedSubstrigPattern_459;

public class Solution {
  public boolean repeatedSubstringPattern(String s) {
    StringBuilder sb;
    int ln = s.length();
    for (int i = ln / 2; i >= 1; i--){
      if (ln % i == 0) {
        sb = new StringBuilder();
        String sub = s.substring(0, i);
        for (int j = 0; j < ln / i; j++) {
          sb.append(sub);
        }
        if (sb.toString().equals(s)) {
          return true;
        }
      }
    }
    return false;
  }
}
