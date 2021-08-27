package Easy.Minimum_Depth_of_Binary_Tree_111;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/27 0:01
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public int minDepth(TreeNode root) {
    return findMin(root);
  }

  private int findMin(TreeNode node) {
    //let the number of this layer be the largest
    int depth = Integer.MAX_VALUE;
    //if this layer is null,so it doesn't have subtree
    if (node == null) {
      return 0;
    }
    //if just have the node tree,so the number of the layer is 1
    if (node.left == null && node.right == null) {
      return 1;
    }
    //get the min number of the subtree
    if (node.left != null) {
      depth = Math.min(findMin(node.left), depth);
    }
    if (node.right != null) {
      depth = Math.min(findMin(node.right), depth);
    }
    //plus this node tree layer number 1
    return depth + 1;
  }
}
