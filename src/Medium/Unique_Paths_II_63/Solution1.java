package Medium.Unique_Paths_II_63;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/23 9:04 上午
 */
public class Solution1 {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //creat the array,and mark the obstacle
    int rowNumber = obstacleGrid.length;
    int colNumber = obstacleGrid[0].length;
    int[][] array = new int[rowNumber][colNumber];
    for (int i = 0; i < rowNumber; i++) {
      for (int i1 = 0; i1 < colNumber; i1++) {
        if (obstacleGrid[i][i1] == 1) {
          array[i][i1] = -1;
        }
      }
    }
    //the special situation,the target is obstacle
    array[0][0] = obstacleGrid[0][0] == 1 ? -1 : 1;
    //judge this location and beside location,if is marked,it also marked
    for (int i = 1; i < rowNumber; i++) {
      array[i][0] = obstacleGrid[i][0] == 1 ? -1 : array[i - 1][0] == -1 ? -1 : 1;
    }
    for (int i = 1; i < colNumber; i++) {
      array[0][i] = obstacleGrid[0][i] == 1 ? -1 : array[0][i - 1] == -1 ? -1 : 1;
    }
    //judge location,have four situation,we need also judge down and right
    for (int i = 1; i < rowNumber; i++) {
      for (int j = 1; j < colNumber; j++) {
        //is marked
        if (array[i][j] == -1) {
          continue;
        } else if (array[i - 1][j] != -1 && array[i][j - 1] != -1) {
          array[i][j] = array[i - 1][j] + array[i][j - 1];
        } else if (array[i - 1][j] != -1) {
          array[i][j] = array[i - 1][j];
        } else {
          array[i][j] = array[i][j - 1];
        }
      }
    }
    //the special situation,the start place is marked
    return array[rowNumber - 1][colNumber - 1] == -1 ? 0 : array[rowNumber - 1][colNumber - 1];
  }
}
