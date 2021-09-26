package Easy.Delete_Node_in_a_Linked_List_237;

/**
 * @author YQHP-YuKi
 * @create 2021-09-25 15:28
 */
public class Solution1 {

  public void deleteNode(ListNode node) {
    //copy the next node value
    node.val = node.next.val;
    //delete the next node
    node.next = node.next.next;
  }
}
