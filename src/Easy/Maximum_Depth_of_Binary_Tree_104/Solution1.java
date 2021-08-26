package Easy.Maximum_Depth_of_Binary_Tree_104;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/26 15:09
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public int maxDepth(TreeNode root) {
    return maxDepthSolution(root);
  }

  private int maxDepthSolution(TreeNode x) {
    //if node is null,so the depth is 0
    if (x == null) {
      return 0;
    }
    //define two variables,x.left tree's depth,x.right tree's depth
    int maxL = 0, maxR = 0;
    //count the depth
    if (x.left != null) {
      maxL = maxDepth(x.left);
    }
    if (x.right != null) {
      maxR = maxDepth(x.right);
    }
    //compare the two depth,return the max and plus 1
    return maxL > maxR ? maxL + 1 : maxR + 1;
  }
}
