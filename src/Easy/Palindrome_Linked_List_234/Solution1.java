package Easy.Palindrome_Linked_List_234;

/**
 * @author YQHP-YuKi
 * @create 2021-09-22 9:48
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  private ListNode tail;

  public boolean isPalindrome(ListNode head) {
    tail = head;
    return recursion(head);
  }

  private boolean recursion(ListNode node) {
    if (node != null) {
      if (!recursion(node.next)) {
        return false;
      }
      //compare the elements node and relative to it
      if (node.val != tail.val) {
        return false;
      }
      //just find the taile
      tail = tail.next;
    }
    return true;
  }
}
