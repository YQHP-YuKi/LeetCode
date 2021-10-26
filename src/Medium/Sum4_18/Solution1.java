package Medium.Sum4_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-23 9:23
 */
public class Solution1 {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    //this question requires us 4
    return nSum(nums, target, 4);
  }

  /**
   * n is the number of digits we need
   */
  private List<List<Integer>> nSum(int[] nums, int target, int n) {
    //first sort the array
    Arrays.sort(nums);
    //then use recursion
    return nSum(nums, target, n, 0, new ArrayList<Integer>(), new ArrayList<List<Integer>>());
  }

  /**
   * startIndex is position to start looking for
   */
  private List<List<Integer>> nSum(int nums[], int target, int n, int startIndex,
      ArrayList<Integer> preArray, ArrayList<List<Integer>> result) {
    //if length is 5,start begin 4,we need find 3 numbers,this is impossible,so just return
    if (nums.length - startIndex < n) {
      return result;
    }
    //if only find one element,we just traversal the array,until we find the element
    if (n == 1) {
      for (int i = startIndex; i < nums.length; i++) {
        if (nums[i] == target) {
          preArray.add(target);
          result.add(preArray);
          break;
        }
      }
      return result;
    }
    //special situation
    if (nums[startIndex] > target / n) {
      return result;
    }
    //filter out the same elements at the beginning
    int same = 0;
    for (int i = startIndex + 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        //record the number of identical elements
        same++;
      } else {
        break;
      }
    }
    //the situation 2,the first element is not we need to find
    nSum(nums, target, n, startIndex + same + 1, preArray, result);
    //the situation 1,the first element is we need to find
    ArrayList<Integer> copyPre = new ArrayList<>(preArray);
    copyPre.add(nums[startIndex]);
    nSum(nums, target - nums[startIndex], n - 1, startIndex + 1, copyPre, result);
    return result;
  }
}
