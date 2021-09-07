package Easy.Binary_Tree_Preorder_Traversal_144;

/**
 * @author YQHP-YuKi
 * @create 2021-09-06 8:48
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();
    preErgodic(root, list);
    return list;
  }

  private void preErgodic(TreeNode node, ArrayList<Integer> keys) {
    //if the node is null,just return
    if (node == null) {
      return;
    }
    //add the ArrayList
    keys.add(node.val);
    //the left subtree
    if (node.left != null) {
      preErgodic(node.left, keys);
    }
    //the right subtree
    if (node.right != null) {
      preErgodic(node.right, keys);
    }
  }
}
