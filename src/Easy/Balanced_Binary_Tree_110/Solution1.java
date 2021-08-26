package Easy.Balanced_Binary_Tree_110;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/26 16:46
 */

import java.util.ArrayList;
import java.util.Queue;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public boolean isBalanced(TreeNode root) {
    //if the number of layers differs by more than 1 just return false
    return maxDepth(root) >= 0;
  }

  private int maxDepth(TreeNode x) {
    if (x == null) {
      return 0;
    }
    //verify the left subtree whether balance
    int maxL = maxDepth(x.left);
    //verify the right subtree whether balance
    int maxR = maxDepth(x.right);
    //if one layers is -1,just all return -1
    if (maxL == -1 || maxR == -1 || Math.abs(maxL - maxR) > 1) {
      return -1;
    }
    //get the max depth
    return maxL > maxR ? maxL + 1 : maxR + 1;
  }
}

