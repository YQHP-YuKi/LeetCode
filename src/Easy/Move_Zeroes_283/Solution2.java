package Easy.Move_Zeroes_283;

/**
 * @author YQHP-YuKi
 * @create 2021-10-06 9:27
 */
public class Solution2 {

  public void moveZeroes(int[] nums) {
    int n = 0;
    for (int i = 0; i < nums.length; i++) {
      //while the element is not 0,exchange with the previous element
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[n];
        nums[n++] = temp;
      }
    }
  }
}
