package numberOfBoomerangs_447;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int numberOfBoomerangs(int[][] points) {
    int boomerangs = 0;
    Map<Integer, Integer> distances = new HashMap<>();
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points.length; j++) {
        if (i == j) {
          continue;
        }
        int distance = getDistance(points[i], points[j]);
        distances.put(distance, distances.getOrDefault(distance, 0) + 1);
      }
      for (int cnt : distances.values()) {
        boomerangs += cnt * (cnt - 1);
      }
      distances.clear();
    }
    return boomerangs;
  }

  private int getDistance(int[] point1, int[] point2) {
    int xDiff = point1[0] - point2[0];
    int yDiff = point1[1] - point2[1];
    return xDiff * xDiff + yDiff * yDiff;
  }
}
