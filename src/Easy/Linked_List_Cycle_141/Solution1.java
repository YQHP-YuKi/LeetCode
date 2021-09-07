package Easy.Linked_List_Cycle_141;

/**
 * @author YQHP-YuKi
 * @create 2021-09-06 8:31
 */

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Solution1 {

  public boolean hasCycle(ListNode head) {
    //make fast and slow double pointer
    ListNode fast = head, slow = head;
    //test example [] -1,just return false
    if (fast == null) {
      return false;
    }
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      //has cycle
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}
