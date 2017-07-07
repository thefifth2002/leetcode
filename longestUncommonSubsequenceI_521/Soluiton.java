package longestUncommonSubsequenceI_521;

public class Soluiton {
  public int findLUSlength(String a, String b) {
    return a.equals(b) ? -1 : Math.max(a.length(), b.length());
  }
}
