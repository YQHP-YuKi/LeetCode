package Medium.Spiral_Matrix_54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/16 10:29 上午
 */
public class Solution1 {

  public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    //define row and col
    int rowStart = 0, rowEnd = matrix.length - 1;
    int colStart = 0, colEnd = matrix[0].length - 1;
    //the number of all elements
    int allElement = (rowEnd + 1) * (colEnd + 1);
    //count the number of the elements what we add
    int counter = 0;
    while (rowStart <= rowEnd || colStart <= colEnd) {
      //top from left to right
      for (int i = colStart; i <= colEnd; i++) {
        list.add(matrix[rowStart][i]);
        counter++;
      }
      //we must subtract the current row or column,otherwise an error will occur
      rowStart++;
      if (counter == allElement) {
        break;
      }
      //right from top to bottom
      for (int i = rowStart; i <= rowEnd; i++) {
        list.add(matrix[i][colEnd]);
        counter++;
      }
      colEnd--;
      if (counter == allElement) {
        break;
      }
      //bottom from right to left
      for (int i = colEnd; i >= colStart; i--) {
        list.add(matrix[rowEnd][i]);
        counter++;
      }
      rowEnd--;
      if (counter == allElement) {
        break;
      }
      //left from bottom to top
      for (int i = rowEnd; i >= rowStart; i--) {
        list.add(matrix[i][colStart]);
        counter++;
      }
      colStart++;
      if (counter == allElement) {
        break;
      }
    }
    return list;
  }
}
