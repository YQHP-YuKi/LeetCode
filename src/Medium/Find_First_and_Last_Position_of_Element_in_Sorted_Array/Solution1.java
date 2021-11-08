package Medium.Find_First_and_Last_Position_of_Element_in_Sorted_Array;

/**
 * @author YQHP-YuKi
 * @create 2021-11-01 11:08
 */
public class Solution1 {

  public int[] searchRange(int[] nums, int target) {
    //boundary problem,you can use DeBug,it is clear to understand the double pointer
    int lower = BinarySearch(nums, target, true);
    int higher = BinarySearch(nums, target, false) - 1;
    //exclude the special situation
    if (higher < nums.length && lower <= higher && nums[lower] == target
        && nums[higher] == target) {
      return new int[]{lower, higher};
    }
    return new int[]{-1, -1};
  }

  private int BinarySearch(int[] array, int target, boolean small) {
    //just like usually binary search
    int left = 0, right = array.length - 1, arrayLength = array.length;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      //why use boolean,because if boolean is true,it means to find the lower target
      if (array[mid] > target || (small && array[mid] >= target)) {
        right = mid - 1;
        arrayLength = mid;
      } else {
        left = mid + 1;
      }
    }
    //the target location is the mid location
    return arrayLength;
  }
}
