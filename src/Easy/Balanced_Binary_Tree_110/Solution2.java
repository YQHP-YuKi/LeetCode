package Easy.Balanced_Binary_Tree_110;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/26 17:17
 */
public class Solution2 {

  public boolean isBalanced(TreeNode root) {
    //if the root is null,just return null
    if (root == null) {
      return true;
    } else {
      //if the number of layers differs by more than 1 or the left subtree is not balanced or the
      // right subtree is not balanced just return false
      return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left)
          && isBalanced(root.right);
    }
  }

  public int height(TreeNode node) {
    //get each layer subtree max height
    if (node == null) {
      return 0;
    } else {
      return Math.max(height(node.left), height(node.right)) + 1;
    }
  }
}
