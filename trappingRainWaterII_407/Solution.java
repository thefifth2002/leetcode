package trappingRainWaterII_407;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public class Cell {
    int row;
    int col;
    int hei;
    public Cell(int row, int col, int hei) {
      this.row = row;
      this.col = col;
      this.hei = hei;
    }
  }
  public int trapRainWater(int[][] heightMap) {
    int water = 0;
    int ver = heightMap.length;
    int hor = heightMap[0].length;
    boolean[][] visited = new boolean[ver][hor];
    Queue<Cell> pq = new PriorityQueue<>(1, new Comparator<Cell>(){
      @Override
      public int compare(Cell o1, Cell o2) {
        return o1.hei - o2.hei;
      }
    });
    for(int i = 0; i < ver; i++) {
      visited[i][0] = true;
      visited[i][hor - 1] = true;
      pq.offer(new Cell(i, 0, heightMap[i][0]));
      pq.offer(new Cell(i, hor -1, heightMap[i][hor -1]));
    }
    for(int i = 0; i < hor; i++) {
      visited[0][i] = true;
      visited[ver - 1][i] = true;
      pq.offer(new Cell(0, i, heightMap[0][i]));
      pq.offer(new Cell(ver - 1, i, heightMap[ver -1][i]));
    }
    int[][] neighbors = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    while (!pq.isEmpty()){
      Cell cell = pq.poll();
      for (int[] neighbor : neighbors) {
        int row = cell.row + neighbor[0];
        int col = cell.col + neighbor[1];
        if (row > 0 && row < ver - 1 && col > 0 && col < hor - 1
            && !visited[row][col]) {
          visited[row][col] = true;
          water = water + Math.max(0, cell.hei - heightMap[row][col]);
          pq.offer(new Cell(row, col, Math.max(cell.hei, heightMap[row][col])));
        }
      }
    }
    return water;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[][] h = {{1,4,3,1,3,2}, {3,2,1,3,2,4}, {2,3,3,2,3,1}};
    System.out.println(sol.trapRainWater(h));
  }
};
