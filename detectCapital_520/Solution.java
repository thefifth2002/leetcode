package detectCapital_520;

public class Solution {
  public boolean detectCapitalUse(String word) {
    String nonCpWord = word.toLowerCase();
    String capWord = word.toUpperCase();
    if (word.equals(nonCpWord) || word.equals(capWord)) {
      System.out.println("fst return");
      return true;
    }
    String fstLetter = word.substring(0, 1);
    String rest = word.substring(1, word.length());
    if (!fstLetter.equals(fstLetter.toLowerCase())
        && rest.equals(rest.toLowerCase())) {
      System.out.println("2nd return");
      return true;
    }
    System.out.println("3rd return");
    return false;
  }
  public static void main(String[] args) {
    String s = "FlaG";
    Solution sol = new Solution();
    System.out.println(sol.detectCapitalUse(s));
  }
}
