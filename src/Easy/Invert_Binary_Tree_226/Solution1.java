package Easy.Invert_Binary_Tree_226;

/**
 * @author YQHP-YuKi
 * @create 2021-09-20 16:45
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public TreeNode invertTree(TreeNode root) {
    invert(root);
    return root;
  }

  private void invert(TreeNode node) {
    //if the node is null,just return
    if (node == null) {
      return;
    }
    //don't mind the two subtree
    invert(node.left);
    invert(node.right);
    //invert the two subtree,make a temp
    TreeNode temp;
    temp = node.left;
    node.left = node.right;
    node.right = temp;
  }
}
