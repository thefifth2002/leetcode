package moveZeroes_283;

public class Solution {
  public void moveZeroes(int[] nums) {
    int id = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        swap(nums, i, id);
        id++;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {0, 1, 0, 3, 12};
  }
}
