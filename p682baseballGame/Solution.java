package p682baseballGame;

import java.util.Stack;

public class Solution {
  public int calPoints(String[] ops){
    Stack<Integer> stack = new Stack<>();
    for(String op : ops) {
      if(op.equals("+")){
        int top = stack.pop();
        int current = top + stack.peek();
        stack.push(top);
        stack.push(current);
      }else if(op.equals("C")){
        stack.pop();
      }else if(op.equals("D")){
        stack.push(stack.peek() * 2);
      }else{
        stack.push(Integer.valueOf(op));
      }
    }
    int res = 0;
    for(int score : stack){
      res += score;
    }
    return res;
  }
}
