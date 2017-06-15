package pascalSTriangle_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> tri = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      row.add(0, 1);
      for(int j = 1; j < row.size() - 1; j++) {
        row.set(j, row.get(j) + row.get(j + 1));
      }
      tri.add(new ArrayList<Integer>(row));
    }
    return tri;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    List<List<Integer>> tri = sol.generate(5);
    System.out.println();
    System.out.println(Arrays.toString(tri.toArray()));
  }
}
