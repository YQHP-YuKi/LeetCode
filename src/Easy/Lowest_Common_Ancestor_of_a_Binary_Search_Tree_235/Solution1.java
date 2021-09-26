package Easy.Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235;

/**
 * @author YQHP-YuKi
 * @create 2021-09-25 9:59
 */
public class Solution1 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // search the right subtree
    if (root.val < p.val && root.val < q.val) {
      return lowestCommonAncestor(root.right, p, q);
    } else if (root.val > p.val && root.val > q.val) {
      //search the left subtree
      return lowestCommonAncestor(root.left, p, q);
    }
    {
      return root;
    }
  }
}
