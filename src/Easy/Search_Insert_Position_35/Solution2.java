package Easy.Search_Insert_Position_35;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/12 15:46
 */
public class Solution2 {

  public int searchInsert(int[] nums, int target) {
    int head = 0, tail = nums.length;
    int mid = 0;
    while (head < tail) {
      mid = head + (tail - head + 1) / 2;
      if (nums[mid - 1] < target) {
        head = mid;
      } else {
        tail = mid - 1;
      }
    }
    return head;
  }
}
