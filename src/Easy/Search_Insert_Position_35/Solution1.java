package Easy.Search_Insert_Position_35;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/12 11:00
 */
public class Solution1 {

  public int searchInsert(int[] nums, int target) {
    int head = 0, tail = nums.length;
    int mid;
    while (head < tail) {
      mid = (tail - head) / 2 + head;
      if (nums[mid] < target) {
        head = mid + 1;
      } else {
        tail = mid;
      }
    }
    return head;
  }
}
