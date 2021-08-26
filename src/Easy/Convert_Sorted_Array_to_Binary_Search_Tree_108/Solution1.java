package Easy.Convert_Sorted_Array_to_Binary_Search_Tree_108;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/26 15:35
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
public class Solution1 {

  public TreeNode sortedArrayToBST(int[] nums) {
    return put(nums, 0, nums.length - 1);
  }

  private TreeNode put(int[] nums, int left, int right) {
    //find the mid
    if (left > right) {
      return null;
    }
    //always choose the number to the left of the middle position as the root node
    int mid = (left + right) / 2;
    //make the node tree
    TreeNode treeNode = new TreeNode(nums[mid]);
    //recursive call the put function
    treeNode.left = put(nums, left, mid - 1);
    treeNode.right = put(nums, mid + 1, right);
    return treeNode;
  }
}
