package insertInterval_57;

//import insertInterval_57.Interval;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Interval> insert(List<Interval> intervals,
      Interval newInterval) {
    List<Interval> merged = new ArrayList<>();
    Interval tmp = null;
    for (Interval interval : intervals) {
      if (newInterval == null || interval.end < newInterval.start) {
        merged.add(interval);
      } else if (newInterval.end < interval.start) {
        merged.add(newInterval);
        merged.add(interval);
        newInterval = null;
      } else {
        newInterval.start = Math.min(interval.start, newInterval.start);
        newInterval.end = Math.max(interval.end, newInterval.end);
      }
    }
    if(newInterval != null) {
      merged.add(newInterval);
    }
    return merged;
  }
}
