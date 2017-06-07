package mergeIntervals_56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
  public List<Interval> merge(List<Interval> intervals) {
    Collections.sort(intervals, new Comparator<Interval>(){
      @Override
      public int compare(Interval arg0, Interval arg1) {
        return arg0.start - arg1.start;
      }
    });
    List<Interval> merged = new ArrayList<>();
    Interval prev = null;
    for (Interval interval : intervals) {
      if (prev == null || interval.start > prev.end) {
        merged.add(interval);
        prev = interval;
      } else if (interval.end > prev.end) {
        prev.end = interval.end;
      }
    }
    return merged;
  }
  private void print(List<Interval> list) {
    for (Interval e : list) {
      System.out.println(e.start + " " + e.end);
    }
  }
  public static void main(String[] args) {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(15, 18));
    Solution sol = new Solution();
    sol.print(intervals);
    System.out.println();
    sol.merge(intervals);
    System.out.println();
    sol.print(intervals);
  }
}
