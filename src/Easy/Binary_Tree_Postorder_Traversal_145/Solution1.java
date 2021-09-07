package Easy.Binary_Tree_Postorder_Traversal_145;

/**
 * @author YQHP-YuKi
 * @create 2021-09-06 10:13
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();
    afterErgodic(root, list);
    return list;
  }

  private void afterErgodic(TreeNode node, ArrayList<Integer> keys) {
    if (node == null) {
      return;
    }
    if (node.left != null) {
      afterErgodic(node.left, keys);
    }
    if (node.right != null) {
      afterErgodic(node.right, keys);
    }
    keys.add(node.val);
  }
}
