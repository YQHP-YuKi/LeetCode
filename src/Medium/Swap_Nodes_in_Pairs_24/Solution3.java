package Medium.Swap_Nodes_in_Pairs_24;

/**
 * @author YQHP-YuKi
 * @create 2021-10-26 19:55
 */
public class Solution3 {

  public ListNode swapPairs(ListNode head) {
    //the special situation
    if (head == null || head.next == null) {
      return head;
    }
    //make a result node,to point to head
    ListNode result = new ListNode(0);
    result.next = head;
    ListNode temp = result;
    //iteration
    while (temp.next != null && temp.next.next != null) {
      ListNode list1 = temp.next;
      ListNode list2 = temp.next.next;
      temp.next = list2;
      list1.next = list2.next;
      list2.next = list1;
      temp = list1;
    }
    //return the head
    return result.next;
  }
}
