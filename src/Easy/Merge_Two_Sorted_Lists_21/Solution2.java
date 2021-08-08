package Easy.Merge_Two_Sorted_Lists_21;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/08 17:51
 */
public class Solution2 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //make a New ListNode
    ListNode preHead = new ListNode();
    //let the head still the head,make a pre to be a mark to find the next
    ListNode pre = preHead;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        pre.next = l1;
        l1 = l1.next;
      } else {
        pre.next = l2;
        l2 = l2.next;
      }
      //update the pre
      pre = pre.next;
    }
    //the remaining ListNode must larger than another one,so just point to it
    pre.next = l1 == null ? l2 : l1;
    //after the head is the answer
    return preHead.next;
  }
}
