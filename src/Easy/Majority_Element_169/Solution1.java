package Easy.Majority_Element_169;

import java.util.Arrays;

/**
 * @author YQHP-YuKi
 * @create 2021-09-13 16:24
 */
public class Solution1 {

  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
