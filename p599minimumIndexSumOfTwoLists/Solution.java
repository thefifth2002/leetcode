package p599minimumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> map = new HashMap<>();
    Set<String> set = new HashSet<>();
    List<String> list = new ArrayList<>();
    for (int i = 0; i < list1.length; i++) {
      map.put(list1[i], i);
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < list2.length; i++) {
      if (map.containsKey(list2[i])) {
        set.add(list2[i]);
        map.put(list2[i], map.get(list2[i]) + i);
      }
    }
    for (String s : set) {
      int sum = map.get(s);
      if (sum < min) {
        list.clear();
        list.add(s);
        min = sum;
      } else if (sum == min) {
        list.add(s);
      }
    }
    return list.toArray(new String[list.size()]);
  }
}
