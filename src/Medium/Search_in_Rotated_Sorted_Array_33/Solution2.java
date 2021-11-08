package Medium.Search_in_Rotated_Sorted_Array_33;

/**
 * @author YQHP-YuKi
 * @create 2021-10-28 16:51
 */
public class Solution2 {

  public int search(int[] nums, int target) {
    //the special situation
    if (nums.length == 1) {
      return nums[0] == target ? 0 : -1;
    }
    //create the two pointers
    int left = 0, right = nums.length - 1;
    //use binary search
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      //judge left side or right side
      if (nums[0] <= nums[mid]) {
        //nums[0] target nums[mid]
        if (target >= nums[0] && target < nums[mid]) {
          right = mid - 1;
        } else {
          //nums[0] nums[mid] target
          left = mid + 1;
        }
      } else {
        //nums[mid] target nums[nums.length-1]
        if (target > nums[mid] && target <= nums[nums.length - 1]) {
          left = mid + 1;
        } else {
          //target nums[mid] nums[nums.length-1]
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
