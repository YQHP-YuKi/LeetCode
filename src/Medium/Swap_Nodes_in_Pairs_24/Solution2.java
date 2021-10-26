package Medium.Swap_Nodes_in_Pairs_24;

/**
 * @author YQHP-YuKi
 * @create 2021-10-26 19:48
 */
public class Solution2 {

  public ListNode swapPairs(ListNode head) {
    //the special situation
    if (head == null || head.next == null) {
      return head;
    }
    ListNode swap = head.next;
    head.next = swapPairs(swap.next);
    swap.next = head;
    return swap;
  }
}
