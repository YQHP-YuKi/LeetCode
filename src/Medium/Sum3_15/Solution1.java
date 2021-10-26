package Medium.Sum3_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-20 9:44
 */
public class Solution1 {

  public List<List<Integer>> threeSum(int[] nums) {
    ArrayList<List<Integer>> lists = new ArrayList<>();
    //the special situation
    if (nums.length < 3) {
      return lists;
    }
    //sort the array
    Arrays.sort(nums);
    //traversal the array
    for (int i = 0; i < nums.length; i++) {
      //if the smallest element is larger than 0,so all the elements are larger than 0,just break
      if (nums[i] > 0) {
        break;
      }
      //repetitive situation,just update the location
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      //use two pointers,search from both sides
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        //find the 3sum
        if (nums[i] + nums[left] + nums[right] == 0) {
          //use Arrays.aslist make array to list
          lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
          //repetitive situation,just update the location
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          //update location
          left++;
          right--;
        } else if (nums[i] + nums[left] + nums[right] > 0) {
          //if larger than 0,it means right pointer is too bigger
          right--;
        } else {
          //if smaller than 0,it means left pointer is too smaller
          left++;
        }
      }
    }
    return lists;
  }
}
