package Easy.Same_Tree_100;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/17 15:41
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      //if the same location is null,then this location is true
      return true;
    } else if (p == null || q == null) {
      //if one is null,the another one is not null,return false
      return false;
    } else if (p.val != q.val) {
      //we can't use p.val==q.val return true.If will judgement after interruption
      return false;
    } else {
      //recursive the same location
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
  }
}
