package p155minStack;

import java.util.Stack;

public class MinStack {
  Stack<Integer> minStack;
  int min;
  public MinStack(){
    minStack = new Stack<>();
    min = Integer.MAX_VALUE;
  }
  public void push(int x){
    min = Math.min(min, x);
    minStack.push(min);
    minStack.push(x);
  }
  public void pop(){
    if(minStack.isEmpty()){
      return;
    }
    minStack.pop();
    minStack.pop();
    if(!minStack.empty()){
      int top = minStack.pop();
      min = minStack.peek();
      minStack.push(top);
    }else{
      min = Integer.MAX_VALUE;
    }
  }
  public int top(){
    return minStack.peek();
  }
  public int getMin(){
    return min;
  }
  public static void main(String[] args){
    MinStack ms = new MinStack();

  }
}
