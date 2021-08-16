package Easy.Remove_Duplicates_from_Sorted_List_83;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/16 15:51
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode deleteDuplicates(ListNode head) {
    //if ListNode is [],just return
    if (head == null) {
      return head;
    }
    //marked the old head
    ListNode oldHead = head;
    //form head to tail
    while (head.next != null) {
      //compare each node
      if (head.val == head.next.val) {
        head.next = head.next.next;
      } else {
        head = head.next;
      }
    }
    //return the head
    return oldHead;
  }
}
