package plusOne_66;

public class Solution {
//  public int[] plusOne(int[] digits) {
//    int ln = digits.length;
//    int plusOne = digits[ln - 1] + 1;
//    digits[ln - 1] = plusOne % 10;
//    int carry = plusOne / 10;
//    for (int i = ln - 2; i >= 0; i--) {
//      int sum = digits[i] + carry;
//      digits[i] = sum % 10;
//      carry = sum / 10;
//    }
//    return digits;
//  }
  public int[] plusOne(int[] digits) {
    int ln = digits.length;
    for (int i = ln - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      else {
        digits[i] = 0;
      }
    }
    int[] res = new int[ln + 1];
    res[0] = 1;
    return res;
  }
}
