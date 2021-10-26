package Medium.Sum3_Closest_16;

import java.util.Arrays;

/**
 * @author YQHP-YuKi
 * @create 2021-10-20 11:21
 */
public class Solution1 {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int result = 0, min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      //if find the same number,just continue
      if (i > 0 && nums[i - 1] == nums[i]) {
        continue;
      }
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        //if find the target,just return
        if (sum == target) {
          return sum;
        }
        //find the closest
        if (Math.abs(sum - target) < min) {
          min = Math.abs(sum - target);
          result = sum;
        }
        //move the double pointers
        if (sum > target) {
          right--;
        } else {
          left++;
        }
      }
    }
    return result;
  }
}
