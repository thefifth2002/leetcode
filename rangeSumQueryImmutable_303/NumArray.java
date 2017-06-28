package rangeSumQueryImmutable_303;

public class NumArray {
  int[] numArray;
  public NumArray(int[] nums) {
    numArray = nums.clone();
    for (int i = 1; i < numArray.length; i++) {
      numArray[i] += numArray[i - 1];
    }
  }
  public int sumRange(int i, int j) {
    if (i == 0) {
      return numArray[j];
    }
    return numArray[j] - numArray[i - 1];
  }
}
