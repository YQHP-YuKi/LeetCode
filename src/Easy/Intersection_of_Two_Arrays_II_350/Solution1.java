package Easy.Intersection_of_Two_Arrays_II_350;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-10-11 9:11
 */
public class Solution1 {

  public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> hashMap1 = new HashMap<>();
    for (int i : nums1) {
      //if is the first time appear,just give a default value of 1
      if (!hashMap1.containsKey(i)) {
        hashMap1.put(i, 1);
      } else {
        //plus the value 1
        hashMap1.put(i, hashMap1.get(i) + 1);
      }
    }
    //length of calculation result
    int n = 0;
    for (int i : nums2) {
      //if have the same key,and value > 0,just add into the result array
      if (hashMap1.containsKey(i) && hashMap1.get(i) > 0) {
        nums2[n++] = i;
        hashMap1.put(i, hashMap1.get(i) - 1);
      }
    }
    return Arrays.copyOfRange(nums2, 0, n);
  }
}
