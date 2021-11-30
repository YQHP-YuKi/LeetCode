package Medium.Unique_Paths_62;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/23 8:47 上午
 */
public class Solution1 {

  public int uniquePaths(int m, int n) {
    int[][] array = new int[m][n];
    //the bottom or the right,it can only move either down or right,so the possible are all 1
    for (int i = 0; i < array.length; i++) {
      array[i][0] = 1;
    }
    for (int i = 0; i < array[0].length; i++) {
      array[0][i] = 1;
    }
    //[m][n]=[m-1][n]+[m][n-1]
    for (int i = 1; i < array.length; i++) {
      for (int j = 1; j < array[0].length; j++) {
        array[i][j] = array[i - 1][j] + array[i][j - 1];
      }
    }
    return array[m - 1][n - 1];
  }
}
