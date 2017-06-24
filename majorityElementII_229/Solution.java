package majorityElementII_229;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> majors = new ArrayList<>();
    if (nums == null || nums.length == 0){
      return majors;
    }
    int major1 = nums[0];
    int major2 = nums[0];
    int cnt1 = 0;
    int cnt2 = 0;
    int ln = nums.length;
    for (int i = 0; i < ln; i++) {
      if (nums[i] == major1) {
        cnt1++;
      } else if (nums[i] == major2) {
        cnt2++;
      } else if (cnt1 == 0) {
        major1 = nums[i];
        cnt1 = 1;
      } else if (cnt2 == 0) {
        major2 = nums[i];
        cnt2 = 1;
      } else {
        cnt1--;
        cnt2--;
      }
    }
    cnt1 = 0;
    cnt2 = 0;
    for (int i = 0; i < ln; i++) {
      if (nums[i] == major1) {
        cnt1++;
      } else if (nums[i] == major2) {
        cnt2++;
      }
    }
    if (cnt1 > ln / 3) {
      majors.add(major1);
    }
    if (cnt2 > ln / 3) {
      majors.add(major2);
    }
    return majors;
  }
}
