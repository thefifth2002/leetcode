package integerToRoman_12;

public class Solution {
  public String intToRoman(int num) {
    StringBuilder sb = new StringBuilder();
    int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    for (int i = 0; i < vals.length; i++) {
      while (num >= vals[i]) {
        num = num - vals[i];
        sb.append(strs[i]);
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.intToRoman(1));
  }
}
