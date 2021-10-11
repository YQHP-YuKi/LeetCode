package Easy.Intersection_of_Two_Arrays_349;

import java.util.Arrays;

/**
 * @author YQHP-YuKi
 * @create 2021-10-11 8:23
 */
public class Solution2 {

  public int[] intersection(int[] nums1, int[] nums2) {
    //sort the two nums
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    //because the result length must be less than or equal to the nums2 or nums1
    int index1 = 0, index2 = 0, n = 0;
    while (index1 < nums1.length && index2 < nums2.length) {
      //if are equal
      if (nums1[index1] == nums2[index2]) {
        //and not the same as the previous element,just updata
        if (n == 0 || nums1[index1] != nums2[n - 1]) {
          nums2[n++] = nums1[index1];
        }
        index1++;
        index2++;
      } else if (nums1[index1] > nums2[index2]) {
        index2++;
      } else {
        index1++;
      }
    }
    //copy the same length of result
    return Arrays.copyOfRange(nums2, 0, n);
  }
}
