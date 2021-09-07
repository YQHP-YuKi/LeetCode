package Easy.Min_Stack_155;

import java.util.LinkedList;

/**
 * @author YQHP-YuKi
 * @create 2021-09-06 10:34
 * <p>
 * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack();
 * obj.push(val); obj.pop(); int param_3 = obj.top(); int param_4 = obj.getMin();
 */
class MinStack {

  /**
   * initialize your data structure here.
   */
  int min = Integer.MAX_VALUE;
  LinkedList<Integer> list;

  public MinStack() {
    //make the min number is the largest
    min = Integer.MAX_VALUE;
    list = new LinkedList<>();
  }

  public void push(int val) {
    list.add(val);
    //compare with every number
    list.addFirst(val <= min ? val : min);
    min = list.peek();
  }

  public void pop() {
    list.poll();
    list.pollLast();
    //switch to the next min number
    min = list.isEmpty() ? Integer.MAX_VALUE : list.peek();
  }

  public int top() {
    return list.peekLast();
  }

  public int getMin() {
    return min;
  }
}
