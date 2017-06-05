package powerOfFour_342;

public class Solution {
  /*/
   * Since, one wants to find if it is the power of 4.
   * It means that the number is of the form
   * 4^n = 2 ^(2n) i.e one of the 2nth bit will be set to 1.
   * i.e if the number is power of 4, then either bit at
   * index 0, 2, 4 and so on will be set to 1. Remember,
   * there will be only one bit set but which one will be set is not known.
   * Look at the input integer as a set of eight nibble(4 bits)
   * each hexadecimal can be rewrote as a 4 digital binary. 0x means hexadecimal,
   * 5 is 4+1 = 2^2 +2^0. So 5 is 0101. 0x555 = 0101 0101 0101.
   */
  public boolean isPowerOfFour(int num) {
    return num > 0 && (num & num - 1) ==0 && (num & 0x55555555) !=0;
  }
}
