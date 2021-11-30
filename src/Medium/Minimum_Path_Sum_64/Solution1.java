package Medium.Minimum_Path_Sum_64;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/30 9:04 上午
 */
public class Solution1 {

  public int minPathSum(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int i1 = 0; i1 < grid[0].length; i1++) {
        //the start place,just continue
        if (i == 0 && i1 == 0) {
          continue;
        } else if (i == 0) {
          //the top boundary
          grid[i][i1] = grid[i][i1 - 1] + grid[i][i1];
        } else if (i1 == 0) {
          //the left boundary
          grid[i][i1] = grid[i - 1][i1] + grid[i][i1];
        } else {
          //in the matrix,add the lower value
          grid[i][i1] = Math.min(grid[i - 1][i1], grid[i][i1 - 1]) + grid[i][i1];
        }
      }
    }
    //return the value of end place
    return grid[grid.length - 1][grid[0].length - 1];
  }
}
