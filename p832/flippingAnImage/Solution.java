package p832.flippingAnImage;

public class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
    int len = A[0].length;
    for (int[] row : A) {
      for (int col = 0; col < (len + 1) / 2; col++) {
        int tmp = row[col] ^ 1;
        row[col] = row[len - 1 - col] ^ 1;
        row[len - 1 - col] = tmp;
        }
      }
    return A;
  }
  public int[][] flipAndInvertImage1(int[][] A) {
    int len = A[0].length;
    for (int[] row : A) {
      for (int col = 0; col < (len + 1) / 2; col++) {
        if (row[col] == row[len - 1 - col]) {
          row[col] = row[len - 1 - col] ^= 1;
        }
      }
    }
    return A;
  }
}

