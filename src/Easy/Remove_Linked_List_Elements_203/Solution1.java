package Easy.Remove_Linked_List_Elements_203;

/**
 * @author YQHP-YuKi
 * @create 2021-09-16 16:11
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode removeElements(ListNode head, int val) {
    //situation head = [7,7,7,7], val = 7
    while (head != null && head.val == val) {
      head = head.next;
    }
    //situation head = [], val = 1
    if (head == null) {
      return head;
    }
    //situation head = [1,2,6,3,4,5,6], val = 6
    ListNode oldNode = head;
    while (oldNode.next != null) {
      //oldNode is 2,oldNode next is 6
      if (oldNode.next.val == val) {
        //so 2 point to 3,delete 6
        oldNode.next = oldNode.next.next;
      } else {
        //oldNode is 1,oldNode next is 2,update oldNode
        oldNode = oldNode.next;
      }
    }
    return head;
  }
}
