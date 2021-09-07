package Easy.Intersection_of_Two_Linked_Lists_160;

/**
 * @author YQHP-YuKi
 * @create 2021-09-07 11:04
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; next = null; } }
 */
public class Solution1 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //if one of headA or headB is null,just return null
    if (headA == null || headB == null) {
      return null;
    }
    ListNode A = headA;
    ListNode B = headB;
    //until they reach together,if A==B,it means they reach the end,just return
    while (A != B) {
      //if A is null,just change to the headB,if not null,just go on
      if (A == null) {
        A = headB;
      } else {
        //
        A = A.next;
      }
      if (B == null) {
        B = headA;
      } else {
        B = B.next;
      }
    }
    //return B is also fine
    return A;
  }
}
