package Easy.Move_Zeroes_283;

/**
 * @author YQHP-YuKi
 * @create 2021-10-06 9:09
 */
public class Solution1 {

  public void moveZeroes(int[] nums) {
    int n = 0;
    //let [0,n] are all non-zero elements
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[n] = nums[i];
        n++;
      }
    }
    //[n+1,nums.length] are all 0
    for (int i = n; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
