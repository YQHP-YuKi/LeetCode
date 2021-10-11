package Easy.Intersection_of_Two_Arrays_349;

import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 16:47
 */
public class Solution1 {

  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> hashSet1 = new HashSet<>();
    HashSet<Integer> hashSet2 = new HashSet<>();
    //add elements into hashSet1
    for (int i : nums1) {
      hashSet1.add(i);
    }
    for (int i : nums2) {
      //exclude elements not included
      if (hashSet1.contains(i)) {
        hashSet2.add(i);
      }
    }
    int[] result = new int[hashSet2.size()];
    int index = 0;
    //take all elements in hashSet2 into array
    for (Integer integer : hashSet2) {
      result[index++] = integer;
    }
    return result;
  }
}
