package Easy.Binary_Tree_Paths_257;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-09-26 9:41
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  /**
   * store all paths
   */
  ArrayList<String> result = new ArrayList<String>();
  /**
   * store the current node
   */
  LinkedList<String> path = new LinkedList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    traverse(root);
    return result;
  }

  /**
   * just like Binary Tree Preorder Traversal
   */
  private void traverse(TreeNode node) {
    //if node is null,just return
    if (node == null) {
      return;
    }
    //String.valueOf make this value become String,and add into the path
    path.add(String.valueOf(node.val));
    //Return leaf node
    if (node.left == null && node.right == null) {
      //add into the result,"->path"
      result.add(String.join("->", path));
    }
    if (node.left != null) {
      traverse(node.left);
    }
    if (node.right != null) {
      traverse(node.right);
    }
    //Delete and return the last element
    path.removeLast();
  }
}
