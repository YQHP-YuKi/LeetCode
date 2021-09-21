package Easy.Reverse_Linked_List_206;

/**
 * @author YQHP-YuKi
 * @create 2021-09-17 16:46
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode reverseList(ListNode head) {
    //slow pointer begin from the null
    ListNode cur = null;
    //fast pointer begin from the head
    ListNode pre = head;
    //until to the end
    while (pre != null) {
      //marked the fast next position
      ListNode temp = pre.next;
      //make the fast point to the slow
      pre.next = cur;
      //update the slo position
      cur = pre;
      //update the fast position
      pre = temp;
    }
    //return the new head
    return cur;
  }
}
