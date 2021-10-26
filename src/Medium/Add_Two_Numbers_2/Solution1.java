package Medium.Add_Two_Numbers_2;

/**
 * @author YQHP-YuKi
 * @create 2021-10-17 9:45
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
public class Solution1 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //create a ListNode of head
    ListNode head = new ListNode(0);
    //move pointer
    ListNode pre = head;
    //n is tens  digit,cur is to judge the last number whether plus 1
    int n = 0, cur = 0;
    while (l1 != null || l2 != null) {
      //if l1 ot l2 is to the end,just let it 0
      int n1 = 0, n2 = 0;
      if (l1 != null) {
        n1 = l1.val;
      }
      if (l2 != null) {
        n2 = l2.val;
      }
      //count the sum of all this location number
      int sum = n1 + n2 + n;
      //refresh n,otherwise the last result will retained
      n = 0;
      //judge whether it is greater than 10
      if (sum >= 10) {
        //tens digit
        n = 1;
        //digit
        sum = sum - 10;
      }
      //if n is 0,don't need add 1 at last
      cur = n;
      //create the new node
      pre.next = new ListNode(sum);
      //update the move pointer and two ListNode
      pre = pre.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    //whether to add 1 at last
    if (cur == 1) {
      pre.next = new ListNode(cur);
    }
    return head.next;
  }
}
