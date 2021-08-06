package Easy.Two_Sum_01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/05 15:20
 */
public class Solution2 {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      //the second number must not not equal to the first number,and add up to target
      if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
        result[0] = i;
        result[1] = map.get(target - nums[i]);
        break;
      }
      map.put(nums[i], i);
    }
    return result;
  }
}
