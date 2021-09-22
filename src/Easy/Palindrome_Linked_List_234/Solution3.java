package Easy.Palindrome_Linked_List_234;

/**
 * @author YQHP-YuKi
 * @create 2021-09-22 10:26
 */
public class Solution3 {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }
    //get the middle element
    ListNode half = findHalf(head);
    //reverse the elements which are after the middle
    ListNode reverse = reverseList(half.next);
    //compare with each element
    ListNode left = head;
    ListNode right = reverse;
    while (right != null) {
      if (left.val != right.val) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  /**
   * find the middle element
   */
  private ListNode findHalf(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    /**
     *this is very important thing you must be notice
     *if you write(fast.next.next!=null&&fast.next!=null) it will java.lang.NullPointerException
     *because if fast is the last element.fast.next is null,so null.next will java.lang.NullPointerException
     * but you write fast.next != null at first.It will select the error first and exit directly
     * */
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  /**
   * reverse the ListNode
   */
  private ListNode reverseList(ListNode node) {
    //slow pointer begin from the null
    ListNode cur = null;
    //fast pointer begin from the head
    ListNode pre = node;
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
