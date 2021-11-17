package Medium.Jump_Game_55;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/16 2:23 下午
 */
public class Solution1 {

  public boolean canJump(int[] nums) {
    //for example [0,2,3],the maxMove is larger than the array's length,but we will stuck at first
    int l = nums.length - 1, maxMove = 0, endIndex = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      //the farthest you can reach in theory
      maxMove = Math.max(maxMove, i + nums[i]);
      //if you reach the actual end location,just update the end location
      if (i == endIndex) {
        endIndex = maxMove;
      }
    }
    return endIndex >= l;
  }
}
