package Easy.Remove_Element_27;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/09 16:19
 */
public class Solution1 {

  public int removeElement(int[] nums, int val) {
    int find = 0;
    for (int num : nums) {
      if (num != val) {
        nums[find] = num;
        find++;
      }
    }
    return find;
  }
}
