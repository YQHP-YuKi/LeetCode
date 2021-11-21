package Medium.Rotate_List_61;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/19 10:31 上午
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode rotateRight(ListNode head, int k) {
    //the special situation
    if (head == null || k == 0) {
      return head;
    }
    //get the list's length
    ListNode temp = head;
    int length = 1;
    while (temp.next != null) {
      temp = temp.next;
      length++;
    }
    //get the position of the node that needs to be rotated
    k %= length;
    //special situation
    if (k == 0) {
      return head;
    }
    //find the position before the rotating node
    ListNode cut = head;
    for (int i = 0; i < length - k - 1; i++) {
      cut = cut.next;
    }
    ListNode rotate = cut.next;
    ListNode key = new ListNode(0);
    //key point to rotate
    key.next = rotate;
    //temp point to head
    temp.next = head;
    //cut point to null
    cut.next = null;
    //key -> rotate -> temp -> head ->cut -> null
    return key.next;
  }
}
