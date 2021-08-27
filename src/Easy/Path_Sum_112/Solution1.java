package Easy.Path_Sum_112;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/27 17:15
 */
public class Solution1 {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    //if don't have this node,just return false
    if (root == null) {
      return false;
    }
    //judge this node value whether equals to the target number
    if (root.left == null && root.right == null) {
      return targetSum == root.val;
    }
    //recursion this function,find target number minus this node value
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right,
        targetSum - root.val);
  }
}
