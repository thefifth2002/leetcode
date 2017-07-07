package studentAttendanceRecordI_551;

public class Solution {
  public boolean checkRecord(String s) {
    int ln = s.length();
    int cnt = 0;
    for (int i = 0; i < ln; i++) {
      if (i <= ln - 3 && s.substring(i, i + 3).equals("LLL")) {
        return false;
      }
      if (s.charAt(i) == 'A') {
        cnt++;
      }
      if (cnt > 1) {
        return false;
      }
    }
    return true;
  }
}
