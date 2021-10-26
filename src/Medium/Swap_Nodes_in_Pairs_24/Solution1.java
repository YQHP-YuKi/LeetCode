package Medium.Swap_Nodes_in_Pairs_24;

import java.util.LinkedList;

/**
 * @author YQHP-YuKi
 * @create 2021-10-26 11:25
 */
public class Solution1 {

  public ListNode swapPairs(ListNode head) {
    //the special situation
    if (head == null || head.next == null) {
      return head;
    }
    //make two Queue
    LinkedList<ListNode> list1 = new LinkedList<>();
    LinkedList<ListNode> list2 = new LinkedList<>();
    //we can use boolean,if it is true,add Queue1,if it is false,add Queue2
    boolean add = true;
    while (head != null) {
      if (add) {
        list1.add(head);
        add = false;
      } else {
        list2.add(head);
        add = true;
      }
      head = head.next;
    }
    //We must remove a node to be the head of the result listnode
    ListNode res = list2.remove();
    ListNode temp = res;
    //we also can make a boolean to minus each Queue,if it is true,minus Queue1,else minus Queue2
    boolean minus = true;
    while (!list1.isEmpty() || !list2.isEmpty()) {
      if (!list1.isEmpty() && minus == true) {
        temp.next = list1.remove();
        minus = false;
      } else {
        //there are two situations in else,one is list2 is empty,we just need to minus Queue1 at
        // last,the another one is list1 is not empty
        if (!list2.isEmpty()) {
          temp.next = list2.remove();
          minus = true;
        } else if (!list1.isEmpty()) {
          temp.next = list1.remove();
        }
      }
      //update temp node
      temp = temp.next;
    }
    //if don't add this,it will happen infinite loop
    if (temp != null) {
      temp.next = null;
    }
    return res;
  }
}
