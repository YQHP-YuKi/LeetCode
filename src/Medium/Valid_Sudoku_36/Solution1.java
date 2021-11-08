package Medium.Valid_Sudoku_36;

import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-11-03 8:41
 */
public class Solution1 {

  /**
   * definite a HashSet to store the numbers
   */
  HashSet<Character> sudo = new HashSet<Character>();

  public boolean isValidSudoku(char[][] board) {
    //judge the lists
    for (int i = 0; i < 9; i++) {
      sudo.clear();
      if (!list(board, i)) {
        return false;
      }
    }
    //judge the rows
    for (int i = 0; i < 9; i++) {
      sudo.clear();
      if (!row(board, i)) {
        return false;
      }
    }
    //judge the little sudoku
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        sudo.clear();
        if (!sudoku(board, i, j)) {
          return false;
        }
        j += 2;
      }
      i += 2;
    }
    return true;
  }

  /**
   * just judge the list function,00,01,02,03...08
   */
  private boolean list(char[][] board, int n) {
    for (int i = 0; i < 9; i++) {
      if (board[n][i] != '.') {
        if (sudo.contains(board[n][i])) {
          return false;
        }
        sudo.add(board[n][i]);
      }
    }
    return true;
  }

  /**
   * just judge the row function,00,10,20...80
   */
  private boolean row(char[][] board, int n) {
    for (int i = 0; i < 9; i++) {
      if (board[i][n] != '.') {
        if (sudo.contains(board[i][n])) {
          return false;
        }
        sudo.add(board[i][n]);
      }
    }
    return true;
  }

  /**
   * just judge the the little sudoku,begin form 00,30,60,03,33
   */
  private boolean sudoku(char[][] board, int n, int m) {
    for (int i = n; i < n + 3; i++) {
      for (int j = m; j < m + 3; j++) {
        if (board[i][j] != '.') {
          if (sudo.contains(board[i][j])) {
            return false;
          }
          sudo.add(board[i][j]);
        }
      }
    }
    return true;
  }
}
