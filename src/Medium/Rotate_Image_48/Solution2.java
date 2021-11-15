package Medium.Rotate_Image_48;

/**
 * @author YQHP-YuKi
 * @create 2021-11-15 10:09
 */
public class Solution2 {

  public void rotate(int[][] matrix) {
    int l = matrix.length;
    //fold in half
    for (int i = 0; i < l / 2; i++) {
      for (int j = 0; j < l; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[l - i - 1][j];
        matrix[l - i - 1][j] = temp;
      }
    }
    //fold in half along the center line
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}
