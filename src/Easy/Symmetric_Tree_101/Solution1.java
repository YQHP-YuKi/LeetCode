package Easy.Symmetric_Tree_101;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/17 16:47
 */
public class Solution1 {

  public boolean isSymmetric(TreeNode root) {
    //the root is not to judge,we judge the subtree
    return symmetric(root.left, root.right);
  }

  public boolean symmetric(TreeNode p, TreeNode q) {
    //null null is the symmetric
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      //null number or number null is not symmetric
      return false;
    } else {
      //val is equal and the left subtree and right subtree is symmetric,it is true
      return p.val == q.val && symmetric(p.left, q.right) && symmetric(p.right, q.left);
    }
  }
}
