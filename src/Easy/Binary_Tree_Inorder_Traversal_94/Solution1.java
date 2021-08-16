package Easy.Binary_Tree_Inorder_Traversal_94;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/16 17:29
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public List<Integer> inorderTraversal(TreeNode root) {
    //make an array to store the notes
    ArrayList<Integer> array = new ArrayList<>();
    //use the method
    midErgodic(root, array);
    //return the array
    return array;
  }

  public void midErgodic(TreeNode root, List<Integer> array) {
    //this root is not exist
    if (root == null) {
      return;
    }
    //recursion the left note
    if (root.left != null) {
      midErgodic(root.left, array);
    }
    //add this root into the arrays
    array.add(root.val);
    //recursion the right root
    if (root.right != null) {
      midErgodic(root.right, array);
    }
  }
}
