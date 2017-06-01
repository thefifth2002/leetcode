package mutiplyStrings_43;

public class Solution {
  public String multiply(String num1, String num2) {
    int ln1 = num1.length();
    int ln2 = num2.length();
    int[] nums = new int[ln1 + ln2];
    for (int i = ln1 - 1; i >= 0; i--) {
      for (int j = ln2 - 1; j >= 0; j--) {
        int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int left = i + j;
        int right = i + j + 1;
        int sum = product + nums[right];
        nums[left] += sum / 10;
        nums[right] = sum % 10;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int num: nums) {
      if (!(num == 0 && sb.length() ==0)) {
        sb.append(num);
      }
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }
}
