package Easy.Reverse_Linked_List_206;

/**
 * @author YQHP-YuKi
 * @create 2021-09-17 17:49
 */
public class Solution2 {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode cur = reverseList(head.next);
    head.next.next = head;
    //we must make the next is null,if we don't do this,it may produce loops
    head.next = null;
    return cur;
  }
}
