package p690.employeeImportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    for (Employee e : employees) {
      map.put(e.id, e);
    }
    return helper(map, id);
  }

  private int helper(Map<Integer, Employee> map, int id) {
    Employee e = map.get(id);
    int ipt = e.importance;
    for (int subordinate : e.subordinates) {
      ipt += helper(map, subordinate);
    }
    return ipt;
  }
}
