package Medium.Jump_Game_II_45;

/**
 * @author YQHP-YuKi
 * @create 2021-11-11 16:10
 */
public class Solution1 {

  public int jump(int[] nums) {
    //count is number of the jump
    int i = 0, count = 0, maxMove = 0, endIndex = 0;
    // five element,have four intervals,so is nums.length-1
    while (i < nums.length - 1) {
      //the farthest pointer theory
      maxMove = Math.max(maxMove, i + nums[i]);
      //while reach the farthest,just need to update the point
      if (i == endIndex) {
        endIndex = maxMove;
        count++;
      }
      i++;
    }
    return count;
  }
}
