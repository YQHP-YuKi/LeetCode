package Medium.Remove_Nth_Node_From_End_of_List_19;

/**
 * @author YQHP-YuKi
 * @create 2021-10-25 9:32
 */
public class Solution2 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    //the slow pointer is one node slower than the fast pointer
    ListNode pre = new ListNode(0);
    pre.next = head;
    ListNode fast = head;
    ListNode slow = pre;
    //fast pointer moves n more nodes than slow
    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }
    //because fast move to tail node,still move to the null node,so move one more step
    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    //if the n node the head of the list,so we can't return the head,we must return the pre next
    slow.next = slow.next.next;
    return pre.next;
  }
}
