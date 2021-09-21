package Easy.Contains_Duplicate_217;

import java.util.Arrays;

/**
 * @author YQHP-YuKi
 * @create 2021-09-18 9:43
 */
public class Solution1 {

  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }
}
