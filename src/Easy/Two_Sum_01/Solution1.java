package Easy.Two_Sum_01;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/05 15:07
 */
public class Solution1 {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int i1 = i + 1; i1 < nums.length; i1++) {
        if (nums[i] + nums[i1] == target) {
          result[0] = i;
          result[1] = i1;
          break;
        }
      }
    }
    return result;
  }
}
