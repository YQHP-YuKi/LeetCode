package Easy.Implement_Queue_using_Stacks_232;

/**
 * @author YQHP-YuKi
 * @create 2021-09-22 8:41
 */

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj = new MyQueue();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.peek(); boolean param_4 = obj.empty();
 */
public class Solution1 {

  class MyQueue {

    Stack<Integer> sta1;
    Stack<Integer> sta2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
      this.sta1 = new Stack<Integer>();
      this.sta2 = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
      //clear the stack1,push all the elements into stack2
      while (!sta1.empty()) {
        sta2.push(sta1.pop());
      }
      //Push to the bottom of the stack
      sta1.push(x);
      //push all the elements back to the stack1
      while (!sta2.empty()) {
        sta1.push(sta2.pop());
      }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
      return sta1.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
      return sta1.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
      return sta1.empty();
    }
  }
}
