package Medium.Next_Permutation_31;

/**
 * @author YQHP-YuKi
 * @create 2021-10-27 17:22
 */
public class Solution1 {

  public void nextPermutation(int[] nums) {
    //the special situation,just reverse the nums
    boolean max = true;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        max = false;
        break;
      }
    }
    if (max) {
      reverse(nums, 0, nums.length - 1);
    } else {
      //find the small digit's location
      int i = nums.length - 2;
      //find i
      while (i > 0) {
        if (nums[i] < nums[i + 1]) {
          break;
        }
        i--;
      }
      //find the larger than small digit
      int n = nums.length - 1;
      while (n > i) {
        //swap these two digits,and revers the digits after the small digit
        if (nums[n] > nums[i]) {
          swap(nums, i, n);
          reverse(nums, i + 1, nums.length - 1);
          break;
        }
        n--;
      }
    }
  }

  /**
   * the function of swap
   */
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  /**
   * the function of reverse the nums
   */
  private void reverse(int[] array, int a, int b) {
    while (a < b) {
      swap(array, a, b);
      a++;
      b--;
    }
  }
}
