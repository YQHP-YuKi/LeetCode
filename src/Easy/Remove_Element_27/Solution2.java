package Easy.Remove_Element_27;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/09 17:30
 */
public class Solution2 {

  public int removeElement(int[] nums, int val) {
    //make two points
    int head = 0, tail = nums.length;
    while (head < tail) {
      //if find the val,exchange the head
      if (nums[head] == val) {
        nums[head] = nums[tail - 1];
        tail--;
      } else {
        head++;
      }
    }
    return head;
  }
}
