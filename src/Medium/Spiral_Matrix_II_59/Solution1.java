package Medium.Spiral_Matrix_II_59;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/19 9:23 上午
 */
public class Solution1 {

  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int rowStart = 0, rowEnd = n - 1;
    int colStart = 0, colEnd = n - 1;
    int allElement = n * n;
    //creat the counter
    int counter = 0;
    while (rowStart <= rowEnd || colStart <= colEnd) {
      for (int i = colStart; i <= colEnd; i++) {
        //because the first number is 1,the counter is 0,so need +1
        matrix[rowStart][i] = counter + 1;
        counter++;
      }
      if (counter == allElement) {
        break;
      }
      rowStart++;
      for (int i = rowStart; i <= rowEnd; i++) {
        matrix[i][colEnd] = counter + 1;
        counter++;
      }
      if (counter == allElement) {
        break;
      }
      colEnd--;
      for (int i = colEnd; i >= colStart; i--) {
        matrix[rowEnd][i] = counter + 1;
        counter++;
      }
      if (counter == allElement) {
        break;
      }
      rowEnd--;
      for (int i = rowEnd; i >= rowStart; i--) {
        matrix[i][colStart] = counter + 1;
        counter++;
      }
      if (counter == allElement) {
        break;
      }
      colStart++;
    }
    return matrix;
  }
}
