package Easy.Contains_Duplicate_II_219;

import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-09-18 10:25
 */
public class Solution1 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    //nums[i] is key,i is value
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      //if find the same nums[i]
      if (hashMap.containsKey(nums[i])) {
        //check the value i is standards compliant
        if (i - hashMap.get(nums[i]) <= k) {
          return true;
        }
      }
      //it must put at last,it put at first,it is a fault code,because when i is 0,it will always
      // return true
      hashMap.put(nums[i], i);
    }
    return false;
  }
}
