package p225implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
  Queue<Integer> q1;
  int top;
  public MyStack() {
    q1 = new LinkedList<>();
  }
  public void push(int x) {
    q1.add(x);
    top = x;
  }
  public int pop() {
    Queue<Integer> q2 = new LinkedList<>();
    while (q1.size() > 1) {
      top = q1.remove();
      q2.add(top);
    }
    int pop = q1.remove();
    q1 = q2;
    return pop;
  }
  public int top() {
    return top;
  }
  public boolean empty() {
    return q1.size() == 0 ? true : false;
  }
}
