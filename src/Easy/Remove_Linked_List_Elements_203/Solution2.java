package Easy.Remove_Linked_List_Elements_203;

/**
 * @author YQHP-YuKi
 * @create 2021-09-16 17:18
 */
public class Solution2 {

  public ListNode removeElements(ListNode head, int val) {
    //just return null
    if (head == null) {
      return null;
    }
    //Recursion head.next
    if (head.next != null) {
      head.next = removeElements(head.next, val);
    }
    //if head.val is val,just delete this head
    if (head.val == val) {
      return head.next;
    } else {
      return head;
    }
  }
}
