package stringToInteger_8;

public class Solution {
  public static int myAtoi(String str) {
    str = str.trim();
    if(str.equals("")) {
      return 0;
    }
    long result = 0;
    boolean negative = false;
    int i = 0;
    int len = str.length();
    if (str.charAt(i) == '-'){
      negative = !negative;
      i++;
    } else if (str.charAt(i) == '+'){
      i++;
    }
    int counter = 0;
    while(i < len && Character.isDigit(str.charAt(i)) && counter < 11) {
      result = result * 10 + Character.getNumericValue(str.charAt(i));
      i++;
      counter++;
    }
    if(negative) {
      result = 0 - result;
    }
    if (result > Integer.MAX_VALUE ) {
      return Integer.MAX_VALUE;
    }
    if (result < Integer.MIN_VALUE ) {
      return Integer.MIN_VALUE;
    }
    return (int)result;
  }

  public static void main(String [] args){
    String s1 = "   dfgher12   3";
    int is1 = myAtoi(s1);
    System.out.println("s1 = " + is1);

    String s2 = "2";
    int is2 = myAtoi(s2);
    System.out.println("s2 = " + is2);
  }
}
