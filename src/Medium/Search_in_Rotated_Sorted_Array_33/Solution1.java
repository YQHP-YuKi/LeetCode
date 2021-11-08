package Medium.Search_in_Rotated_Sorted_Array_33;

/**
 * @author YQHP-YuKi
 * @create 2021-10-28 16:48
 */
public class Solution1 {

  public int search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return i;
      }
    }
    return -1;
  }
}
