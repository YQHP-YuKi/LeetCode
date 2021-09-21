package Easy.Implement_Stack_using_Queues_225;

/**
 * @author YQHP-YuKi
 * @create 2021-09-18 15:41
 * <p>
 * Your MyStack object will be instantiated and called as such: MyStack obj = new MyStack();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj = new MyStack();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
 */
public class Solution {

  class MyStack {

    Queue<Integer> que1;
    Queue<Integer> que2;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
      this.que1 = new LinkedList<Integer>();
      this.que2 = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
      //element push into queue2
      que2.offer(x);
      //push the old element in queue1
      while (!que1.isEmpty()) {
        que2.offer(que1.poll());
      }
      //swap the queue1 and queue2
      Queue<Integer> temp = que1;
      que1 = que2;
      que2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
      return que1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
      return que1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {

      return que1.isEmpty();
    }
  }
}


