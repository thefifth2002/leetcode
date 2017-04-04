package palindromeNumber_9;

public class Solution {
  public static boolean isPalindrome1(int x) {
    boolean isTrue = false;
    int rev = 0;
    int len = 0;
    int counter = 0;

    if (x != 0) {
      len = (int)(Math.log10(x) + 1);
    } else {
      return true;
    }

    if (x < 0 || x % 10 == 0) {
      return false;
    } else if (x < 10) {
      return true;
    }

    while (counter < len /2) {
      System.out.println(counter);
      rev = rev * 10 + x % 10;
      x = x / 10;
      counter++;
    }
    if (rev == x || rev == x / 10) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean isPalindrome(int x) {
    if (x < 0 || x != 0 && x % 10 == 0) {
      return false;
    }
    int rev = 0;
    while (x > rev) {
      rev = rev * 10 + x % 10;
      x = x / 10;
    }
    return x == rev || x == rev / 10;
  }

  public static void main(String[] args) {
    int n1 = 123;
    int n2 = 31113;
    boolean is1 = isPalindrome(n1);
    boolean is2 = isPalindrome(n2);
    System.out.println(is1);
    System.out.println(is2);
  }
}
