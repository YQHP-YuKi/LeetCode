package Easy.Merge_Sorted_Array_88;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/16 16:51
 */
public class Solution1 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    //make a new array to get the answer
    int[] result = new int[m + n];
    //beginning from both head
    int i = 0, j = 0, temp;
    while (i < m || j < n) {
      if (i == m) {
        //if nums1 is ending just copy the nums2
        temp = nums2[j++];
      } else if (j == n) {
        //if nums2 is ending just copy the nums1
        temp = nums1[i++];
      } else if (nums1[i] < nums2[j]) {
        //copy the smaller number
        temp = nums1[i++];
      } else {
        temp = nums2[j++];
      }
      result[i + j - 1] = temp;
    }
    //copy the answer to the nums1
    for (int length = 0; length < n + m; length++) {
      nums1[length] = result[length];
    }
  }
}
