package Easy.Palindrome_Linked_List_234;

import java.util.ArrayList;

/**
 * @author YQHP-YuKi
 * @create 2021-09-22 10:16
 */
public class Solution2 {

  public boolean isPalindrome(ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();
    //iterate the array to find the tail of the array
    ListNode tail = head;
    while (tail != null) {
      list.add(tail.val);
      tail = tail.next;
    }
    int i = 0, j = list.size() - 1;
    //compare each elements
    while (i < j) {
      if (!list.get(i).equals(list.get(j))) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
