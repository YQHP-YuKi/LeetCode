package Medium.Generate_Parentheses_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-25 17:35
 */
public class Solution1 {

  /**
   * define a ArrayList to store the parentheses
   */
  ArrayList result = new ArrayList<String>();

  public List<String> generateParenthesis(int n) {
    //the default number of left subtree and right subtree are all 0
    dfs(n, 0, 0, "");
    return result;
  }

  /**
   * Depth first traversal
   */
  private void dfs(int n, int left, int right, String str) {
    if (left == n && right == n) {
      //traversed to the bottom of the tree,just return the result
      result.add(str);
    } else {
      if (left < n) {
        //add the `(`
        dfs(n, left + 1, right, str + "(");
      }
      //the number of `)` at most the number of `(`
      if (right < n && right < left) {
        dfs(n, left, right + 1, str + ")");
      }
    }
  }
}
