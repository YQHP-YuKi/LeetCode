package Medium.Remove_Nth_Node_From_End_of_List_19;

/**
 * @author YQHP-YuKi
 * @create 2021-10-25 8:44
 */

import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    //create a stack,and push all elements into stack
    Stack<ListNode> stackNode = new Stack<>();
    ListNode temp = head;
    while (temp != null) {
      stackNode.push(temp);
      temp = temp.next;
    }
    //pop n-1 elements
    for (int i = 0; i < n - 1; i++) {
      stackNode.pop();
    }
    //pop the n element
    ListNode node = stackNode.pop();
    //if the n is the first of the lists,so this stack is empty,just return the node.next
    //else just remove the n element
    if (!stackNode.isEmpty()) {
      ListNode deleteNode = stackNode.peek();
      deleteNode.next = deleteNode.next.next;
    } else {
      return node.next;
    }
    return head;
  }
}
